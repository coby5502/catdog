package com.example.catdog.food

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.catdog.R

class FoodViewModel(application: Application) : AndroidViewModel(application) {
    companion object {
        var type: Int? = 0
        var pos: Int? = 0

        var fruit_name = arrayListOf<String>(
            "감",
            "귤",
            "대추",
            "딸기",
            "망고",
            "멜론",
            "무화과",
            "바나나",
            "배",
            "복숭아",
            "블루베리",
            "사과",
            "수박",
            "아보카도",
            "오렌지",
            "자두",
            "자몽",
            "체리",
            "키위",
            "파인애플",
            "포도/건포도"
        )
        var fruit_img = arrayListOf<Int>(
            R.drawable.persimmon,
            R.drawable.tangerine,
            R.drawable.jujube,
            R.drawable.strawberry,
            R.drawable.mango,
            R.drawable.melon,
            R.drawable.fig,
            R.drawable.banana,
            R.drawable.pear,
            R.drawable.peach,
            R.drawable.blueberry,
            R.drawable.apple,
            R.drawable.watermelon,
            R.drawable.avocado,
            R.drawable.orange,
            R.drawable.plum,
            R.drawable.grapefruit,
            R.drawable.cherry,
            R.drawable.kiwi,
            R.drawable.pineapple,
            R.drawable.grape
        )
        var fruit_yn = arrayListOf<String>(
            "O",
            "O",
            "O",
            "O",
            "O",
            "O",
            "X",
            "O",
            "O",
            "O",
            "O",
            "O",
            "O",
            "X",
            "O",
            "O",
            "X",
            "△",
            "O",
            "O",
            "X"
        )
        var fruit_description = arrayListOf<String>(
            """
                칼륨, 베타카로틴이 포함되어 있어 시력 건강과 노화 방지에 도움을 준다. 저지방 고섬유질로 규칙적인 배변활동을 유지할 수 있게 한다.
                단, 덜익은 감보다 홍시나 단감의 속살만 급여한다.
                """.trimIndent(),
            """
                비타민C, 엽산, 베타카로틴 등이 풍부하여 면역력, 눈, 장 건강, 나트륨 배출에 도움을 준다. 
                단 당이 많기 때문에 과체중일 경우 독이 될 수 있다. 귤껍질과 흰색껍질까지 제거해서 급여한다.
                """.trimIndent(),
            "식이섬유, 비타민, 항산화물질이 풍부하여 면역력 향상과 장건강에 도움을 준다. 단, 씨앗과 꼭지는 제거하고 하루 1~2개만 급여한다.",
            "항산화제와 영양소가 풍부해 치아건강에 도움이 되고 항암 작용 효과가 있다.",
            "비타민 A • C • D, 식이섬유, 항산화물질이 함유되어있어 변비 개선, 모질, 면역력 강화에 도움이 된다.",
            """
                라이코펜 성분이 체내 유해산소를 제거하고 암을 예방한다. 
                칼륨 성분이 풍부해 염분을 배출하고 이뇨작용으로 신장을 좋게 해준다.
                단, 씨앗에 시안화물이라는 독성물질이 있어 씨앗과 껍질은 제거하고 급여한다.
                """.trimIndent(),
            "솔라렌, 피신이라는 물질이 구토, 구내염을 일으킬 수 있다. 다량 섭취시 중독 위험 있다.",
            """
                일반 과일보다 비타민 C를 10배 높게 함유하고 있어 피로 회복 및 무기력증 해소에 도움. 펙틴, 미네랄, 섬유질 등의 영양소가 장 운동, 면역력 강화에 도움을 준다.
                단 신장이 좋지 않을 경우 독이 될 수 있다.
                """.trimIndent(),
            "사포닌, 루테올린이라는 성분이 기관지 질환을 예방에 도움을 준다. 인버테이스, 옥시데이스라는 소화효소가 풍부해서 소화 기능이 약할 경우 효과적이다. 단, 씨에는 독성이 존재하므로 제거하고 급여한다.",
            """
     비타민 C • E, 칼륨, 식이섬유를 함유하여 면역을 향상시키고 대사를 원활하게 한다.
     복숭아의 씨앗, 껍질, 잎에 아미그달린이라는 물질이 소화가 될 때 시안화수소를 발생시키므로 반드시 이를 제거하고 급여한다.
     """.trimIndent(),
            """
                풍부한 섬유질이 노화를 방지해주고 심장질환, 뇌졸중 등 여러 가지 질병을 예방해주어 노견에게도 효과적이다.
                단 당분이 많아 치석이 쌓일 수 있어 적당량 급여한다.
                """.trimIndent(),
            """
                비타민 A • B • C • E, 베타카로틴, 식이섬유가 있어 건강에 이롭다. 펙틴 성분은 유독 성분을 흡수해 피부 또한 좋게 해준다. 
                단, 씨앗에 독성 성분이 있으므로 반드시 제거해야 한다.
                """.trimIndent(),
            """
                수분 함량이 높아 갈증 해소에 좋고 비타민 A•B•C와 티아민 등이 함유되어 있어 면역력 개선에 도움을 준다. 칼로리가 낮아 부담이 없다. 라이코펜 성분이 암 예방에 도움을 준다. 
                단 수박 씨를 먹을 경우 장폐색을 일으킬 수 있으므로 씨를 반드시 제거하고 급여한다.
                """.trimIndent(),
            "페르신이라는 성분이 호흡곤란, 위장장애, 복통 등을 일으킬 수 있다.",
            """
                비타민 C가 풍부하고 섬유질이 소화에 도움을 준다. 단, 껍질과 씨앗을 제거한 후 적당량 급여한다.
                당분이 많이 포함되어 있어 당뇨, 비만일 경우 급여하지 않는 것이 좋다.
                """.trimIndent(),
            """
                섬유질이 풍부하여 콜레스테롤 수치를 낮춰준다. 비타민 K가 뼈 건강을 개선하고 관절염을 예방할 수 있게 한다.
                단, 껍질과 씨를 제거하고 급여한다.
                """.trimIndent(),
            "산성함량이 높아 위장 장애, 소화 문제 일으킬 수 있다. 씨앗에 소랄렌이라는 성분이 중독 현상을 일으킬 수 있다.",
            """
                칼륨 성분이 혈압을 조절하고 고혈압과 뇌졸중의 위험을 감소시킨다. 철분이 매우 풍부해 빈혈 예방과 개선에 도움을 준다.
                단, 씨앗에 시안화물이라는 독성 성분이 함유되어 있어 청색증, 호흡곤란, 구토, 설사 등을 일으킬 수 있으니 씨앗, 줄기, 잎은 제거하고 과육만 급여한다.
                """.trimIndent(),
            "비타민 C가 풍부하여 감기예방 및 면역력 개선에 효과적이다. 비타민 E, 칼륨, 베타카로틴 성분이 변비 예방, 피로회복, 심혈관질환 예방 등에 도움을 준다.",
            "식이섬유와 비타민 C가 면역력향상과 모질에 도움을 주고 구연산과 브로멜린이라는 호소가 소화를 용이하게 해준다. 섬유질과 당이 다량 함유되어 있어 당뇨가 있거나 비만견일 경우 주지 않는 것이 좋다.",
            "안토시아닌이라는 성분이 급성신부전증 등의 질환을 일으킬 수 있다."
        )
        var fruit = arrayOf(fruit_name, fruit_img, fruit_yn, fruit_description)

        var veg_name = arrayListOf<String>(
            "가지", "감자", "고구마", "고추", "당근", "마늘", "무", "배추", "브로콜리",
            "상추", "시금치", "아스파라거스", "양배추", "양파", "연근",
            "오이", "토마토", "파", "파프리카", "호박"
        )
        var veg_img = arrayListOf<Int>(
            R.drawable.eggplant,
            R.drawable.potato,
            R.drawable.sweetpotato,
            R.drawable.chilipepper,
            R.drawable.carrot,
            R.drawable.garlic,
            R.drawable.radish,
            R.drawable.cabbage,
            R.drawable.brocoli,
            R.drawable.lettuce,
            R.drawable.spinach,
            R.drawable.asparagus,
            R.drawable.cabbage2,
            R.drawable.onion,
            R.drawable.lotusroot,
            R.drawable.cucumber,
            R.drawable.tomato,
            R.drawable.scallion,
            R.drawable.paprika,
            R.drawable.pumpkin
        )
        var veg_yn = arrayListOf<String>(
            "O",
            "O",
            "O",
            "X",
            "O",
            "X",
            "O",
            "O",
            "O",
            "O",
            "O",
            "O",
            "O",
            "X",
            "O",
            "O",
            "O",
            "X",
            "O",
            "O"
        )
        var veg_description = arrayListOf<String>(
            """
                콜레스테롤 수치를 낮춰주고 칼륨이 이뇨작용을 도와 체내 나트륨과 독소를 배출한다. 또, 안토시아닌 성분이 항산화 작용을 하여 노화를 억제한다.
                단, 생가지에는 솔라렌이라는 독성 성분이 들어있어 반드시 익혀서 급여한다.
                """.trimIndent(),
            "철분이 혈관 기능 유지에 도움을 주고 비타민 C가 풍부하여 노화예방에 효과적이다. 또, 식이섬유가 풍부하여 배변활동을 활발하게 한다. 익힌 후 으깨서 주는 것이 좋고, 껍질을 제거하고 설탕이나 소금 같은 첨가물은 첨가하지 않고 급여한다.",
            "베타카로틴이 있어 면역력을 높여준다. 마그네슘이 풍부하여 뼈와 근육의 원활한 작용을 돕는다. 또, 섬유질이 풍부하여 변비, 소화에 도움을 준다. 줄기와 껍질은 제거하여 급여하고, 당 수치가 높아 당뇨나 신장이 약할 경우 급여하지 않는 것이 좋다.",
            "캡사이신으로 인해 설사나 탈수가 일어날 수 있고 식도나 위 등의 내장기관을 손상시킬 수 있다.",
            "" +
                    "베타카로틴 성분이 풍부하여 피부, 관절, 치아 등을 건강하게 하며, 루테인과 리코펜 성분이 눈 건강에 도움을 준다. 단, 식분증이 있다면 주지 않는 것이 좋다.",
            """
                해독 성분이 있어 항암 작용을 하고 강한 냄새를 가지고 있어 체내 기생충을 제거하는데에 도움이 된다. 
                그러나 티오황산염이라는 성분이 독성 반응을 일으켜 설사, 황달, 빈혈 등의 증세가 나타날 수 있다.
                """.trimIndent(),
            "아밀라아제와 디아스타아제가 소화를 원활하게 하고 글루코시놀레이트라는 성분이 해독작용을 하여 항암효과를 향상시킨다. 단, 위염이 있을 경우 기력을 약하게 할 수 있기 때문에 급여하지 않는 것이 좋다.",
            """
                비타민 C, 칼슘, 칼륨, 인이 들어가 있어 뼈건강에 좋고 식이섬유가 풍부해 변비에 도움을 준다. 
                단, 이소티오시안염을 함유하고 있어 다량 급여시 갑상선 기능 저하증을 일으킬 수 있다.
                """.trimIndent(),
            "루테인, 제아잔틴 성분이 눈의 피로를 줄여주고 백내장과 같은 질병을 예방하고, 설포라반 성분이 분비되어 면역력을 강화시키고 노화와 관련된 질병을 예방한다. 깨끗이 씻어서 1~2분 정도 익혀서 급여한다.",
            "수분이 많이 포함되어 있어 갈증 해소에 좋고 섬유질이 풍부하여 소화에 도움을 준다. 농약이 묻어있을 수 있기 때문에 깨끗이 씻어서 급여하는 것이 좋다.",
            """
                비타민 A•B•C•K가 함유되어 있어 뼈를 튼튼하게 한다. 엽산과 철분이 있어 빈혈에 효과가 있다.
                단, 시금치의 옥산살이라는 성분이 칼륨 흡수를 막기 때문에 끓는 물로 데쳐서 급여하는 것이 좋다.
                """.trimIndent(),
            "아스파라긴산이라는 성분이 단백질합성과 피로회복에 도움을 준다. 글루타티온 성분이 있어 암과 관절염 예방에 효과가 있다. 딱딱하고 질기기 때문에 찌거나 삶아서 주는 것이 좋다.",
            """
                비타민 U•K가 위점막을 보호해주고 위궤양을 예방한다. 식이섬유가 장운동을 활성화시켜 변비에 효과가 있다.
                단, 심지부분과 겉부분은 제거하고 속잎만 급여한다.
                """.trimIndent(),
            "N-propyl disulfide라는 독성 물질이 용혈성 빈혈을 일으킨다. 일정량 이상 섭취했을 경우 구토, 설사, 혼수상태 등의 중독 증상이 나타난다.",
            """
                콜레스테롤이 없기 때문에 다이어트용으로 적합하다. 비타민 B, C, E가 함유되어 있어 면역력을 향상시켜준다.
                단, 장에 무리를 줄 수 있으니 삶거나 익혀서 급여한다.
                """.trimIndent(),
            """
                비타민 C, 베타카로틴, 망간 등의 항산화제와 플라보노이드, 트리테르펜, 리그난 같은 항염증을 가진 성분을 함유하고 있다. 또 큐커비타신이라는 성분이 암을 예방하는데에 도움을 준다.
                단, 껍질을 벗기고 소량만 급여한다.
                """.trimIndent(),
            """
                라이코펜 성분이 항산화 작용을 하여 암예방에 효과가 있다. 베타카로틴 성분이 시력 보호에 도움을 주고 여러 비타민이 피로회복과 에너지원을 공급한다.
                단, 잎과 줄기에 독성성분이 있기 때문에 제거하고 급여한다.
                """.trimIndent(),
            "allyl propyl disulfide 라는 성분이 중독 현상을 일으켜 빈혈, 구토, 간손상, 혈뇨 등의 증상이 나타날 수 있다.",
            """
                빨간색- 면역력 강화, 항암작용 효과가 있고 칼륨과 인이 풍부하다.
                
                주황색- 아토피 개선, 눈건강, 피부, 모질 개선에 도움을 준다.
                
                노란색- 스트레스를 해소해주고 혈액을 맑게 해주어 고혈압을 예방한다. 또, 파라진이라는 성분이 혈액응고를 예방한다.
                
                초록색- 변비, 빈혈을 예방한다.
                """.trimIndent(),
            """
                섬유질이 풍부하여 위장 내 움직임을 원활하게 한다. 이 외에도 비타민 C, 베타카로틴, 칼륨, 철분 등의 영양소를 함유하고 있어 항산화 작용에 도움을 준다. 
                단, 소화가 힘든 씨앗과 꼭지 부분은 제거하고 익혀서 급여한다.
                """.trimIndent()
        )
        var veg = arrayOf(veg_name, veg_img, veg_yn, veg_description)

        var meat_name = arrayListOf<String>("닭", "돼지", "소", "양", "오리")
        var meat_img = arrayListOf<Int>(
            R.drawable.chicken,
            R.drawable.pork,
            R.drawable.beef,
            R.drawable.lamb,
            R.drawable.duck
        )
        var meat_yn = arrayListOf<String>("O", "O", "O", "O", "O")
        var meat_description = arrayListOf<String>(
            "고단백 저지방 식품으로 비타민이 많아 각종 질병을 예방하고 섬유질이 가늘어 소화흡수가 용이하다. 익혀서 줄 경우 뼈는 제거하고, 껍질에 다량의 지방이 농축되어 있어 제거하는 것이 좋다.",
            """
                단백질과 필수 아미노산이 들어있어 면역을 향상시키고, 사르코신이라는 성분이 근력을 강화시킨다.
                날고기에는 바이러스가 있을 수 있어 익힌 것을 주는 것이 좋고, 되도록 지방이 적은 부위를 급여한다.
                """.trimIndent(),
            "비타민 B 함유량이 다른 육류보다 훨씬 높아 혈관질환을 예방하는데에 도움이 된다. 양념된 고기나 날고기는 주지 않아야 하며 기름기가 많으므로 지방을 제거하고 급여하는 것이 좋다. 또 돼지고기 뼈는 익혔을 때 매우 날카로우므로 뼈를 제거해야한다.",
            "비타민B3와 철분이 다량 함유되어있어 혈액순환과 빈혈 예방에 효과가 있다. 특유의 잡내가 있어 급여를 거부하는 경우가 있으므로 애견 상품으로 판매하는 고기를 급여하는 것을 권한다.",
            """
                불포화지방산을 포함하고 있어 피부와 모질 개선에 도움을 주고 다른 육류보다 기름기가 적어 단백질 섭취에 좋다. 
                
                단, 훈제는 첨가물과 조미료 성분이 들어있기 때문에 급여해서는 안되고, 푹 삶아서 주는 것이 좋다.
                """.trimIndent()
        )
        var meat = arrayOf(meat_name, meat_img, meat_yn, meat_description)

        var fish_name = arrayListOf<String>("고등어", "굴", "꽁치", "멸치", "삼치", "연어", "오징어", "조개", "참치")
        var fish_img = arrayListOf<Int>(
            R.drawable.mackerel,
            R.drawable.oyster,
            R.drawable.pacificsaury,
            R.drawable.anchovy,
            R.drawable.spanishmackerel,
            R.drawable.salmon,
            R.drawable.squid,
            R.drawable.clam,
            R.drawable.tuna
        )
        var fish_yn = arrayListOf<String>("△", "X", "△", "O", "△", "O", "X", "X", "△")
        var fish_description = arrayListOf<String>(
            "오메가-3 지방산이 풍부하여 피모를 개선하고 털빠짐을 완화해준다. 셀레늄 성분이 활성산소를 제거하여 질병을 예방한다. 단, 지속적으로 또는 과다하게 섭취할 경우 수은 중독 위험이 있어 유의해야 한다. 또한 날것으로 급여할 경우 기생충 감염의 위험이 있으므로 조림이나 스튜 형태로 급여하는 것이 좋다.",
            "날 것으로 먹을 경우 식중독이 생길 수 있고 티아민 성분을 분해하여 티아민 결핍이 일어나면 경련, 발작 등의 증세를 나타낼 수 있다.",
            "칼슘과 콜라겐, 비타민이 풍부하여 혈액순환과 관절건강에 도움이 된다. 그러나 지방 함량이 높아 장에 무리를 줄 수 있다. 조미료가 들어가지 않은 것을 급여하고 뼈를 제거하여 익혀서 급여하는 것을 권장한다.",
            "오메가-3 지방산인 EPA• DHA가 풍부하여 두뇌발달, 관절염, 암 면역에 도움이 된다. 끓는 물에 데치거나 익혀서 급여하는 것이 좋다.",
            "아미노산의 일종인 타우린이 일정체온을 유지할 수 있게 하고 칼슘이 풍부해 뼈 강화에 도움을 준다. 그러나 과잉 섭취할 경우 황색지방증이 생길 수 있어 한번에 많이, 자주 급여하지 않도록 해야한다.",
            "탄수화물보다 단백질이 더 풍부하여 부담이 적고, 탄수비타민을 다량 함유하고 있어 사료나 간식으로 많이 사용된다. 연어회는 중독 증상을 일으킬 수 있기 때문에 푹 익혀서 가시를 제거하고 급여해야 한다.",
            "미네랄과 단백질, 비타민이 풍부하지만 매우 질겨 삼킬 경우 소화기관에 무리를 줄 수 있고 심하면 소화가 되지 않고 위에서 부패되어 조직을 괴사시킬 수 있다. 또 다른 음식에 비해 염분이 많아 독이 될 수 있다.",
            "염분이 많아 복통이나 구토를 유발할 수 있다. 독성이 있는 것을 먹게 될 경우 식중독이나 장염, 심할경우 마비성패류중독에 감염될 수 있다.",
            "육류 알레르기가 있을 경우 대체 가능한 고단백질 식품이며 오메가-3와 비타민 B군이 풍부하다. 그러나 사람이 먹는 참치캔은 염분과 기름이 많아 좋지 않으므로 기름을 제거하고 물에 끓여 염분을 제거해야한다. 강아지 전용 참치를 급여하는 것이 가장 좋다."
        )
        var fish = arrayOf(fish_name, fish_img, fish_yn, fish_description)

        var nut_name = arrayListOf<String>("땅콩", "마카다미아", "밤", "아몬드", "잣", "피스타치오", "호두")
        var nut_img = arrayListOf<Int>(
            R.drawable.peanut,
            R.drawable.macadamia,
            R.drawable.chestnut,
            R.drawable.almond,
            R.drawable.pinenuts,
            R.drawable.pistachio,
            R.drawable.walnut
        )
        var nut_yn = arrayListOf<String>("△", "X", "O", "X", "X", "△", "X")
        var nut_description = arrayListOf<String>(
            "칼륨이 나트륨 배출을 도와 심혈관질환 예방에 도움을 준다. 비타민 B가 풍부하여 콜레스테롤 수치를 낮춰준다. 그러나 지방이 많아 다량 급여시 췌장염의 위험이 있다. 껍질 벗긴 상태로 소량만 급여해야 한다.",
            "비틀거림, 종양, 구토 등의 중독 증세가 나타날 수 있다. 섭취했을 경우 가능한 빨리 동물병원에 내원하여 체내에 흡수되는 것을 막아야 한다.",
            "비타민B1, 티아민이 풍부하여 피로회복에 좋다. 또한 섬유질이 풍부하여 변비가 있거나 장이 좋지 않은 반려견에게 효과가 있다. 되도록이면 껍질을 제거하고 잘게 부수거나 삶아서 급여한다.",
            "아스페르질루스(Aspergillus)라는 곰팡이가 필 경우 중독 증상 일으킨다. 다량 섭취시 소화장애가 발생할 수 있다.",
            "지방과 인 함량이 매우 높아 췌장염이나 요로 감염 합병증 등을 일으킨다.",
            """
                과다 섭취시 위장장애, 비만, 췌장염이 발생할 위험이 있다. 곰팡이가 배양될 수 있는 환경을 제공하여 
                곰팡이의 아플라톡신이라는 성분이 황달, 간 장애, 구토 발작 등을 일으키고 심한 경우 죽음에 이르게 할 수 있다.
                """.trimIndent(),
            "호두 사이 핀 곰팡이가 위장장애와 신경장애 등을 일으킨다."
        )
        var nut = arrayOf(nut_name, nut_img, nut_yn, nut_description)

        var food = arrayOf(fruit, veg, meat, fish, nut)
    }
}
package com.example.yourpsychologist

val usersDataList: ArrayList<User> = arrayListOf(User("patient", "12345678"))

val psychologistsDataList: ArrayList<Psychologist> = arrayListOf(
        Psychologist("Иванов Иван Иванович",3,5.00, mapOf(
            "19.03.2023" to arrayListOf<String>("12:00","13:00", "14:00"),
            "20.03.2023" to arrayListOf<String>("15:00","16:00", "17:00"),
            "21.03.2023" to arrayListOf<String>("18:00","19:00", "20:00"),
        )),
        Psychologist("Петров Петр Петрович",4,5.00, mapOf(
            "19.03.2023" to arrayListOf<String>("12:00","13:00", "14:00"),
            "20.03.2023" to arrayListOf<String>("15:00","16:00", "17:00"),
            "21.03.2023" to arrayListOf<String>("18:00","19:00", "20:00"),
        )),
        Psychologist("Игорев Игорь Игоревич",5,5.00, mapOf(
            "19.03.2023" to arrayListOf<String>("12:00","13:00", "14:00"),
            "20.03.2023" to arrayListOf<String>("15:00","16:00", "17:00"),
            "21.03.2023" to arrayListOf<String>("18:00","19:00", "20:00"),
        )),
        Psychologist("Борисов Борис Борисович",6, 5.00, mapOf(
            "19.03.2023" to arrayListOf<String>("12:00","13:00", "14:00"),
            "20.03.2023" to arrayListOf<String>("15:00","16:00", "17:00"),
            "21.03.2023" to arrayListOf<String>("18:00","19:00", "20:00"),
        )),
        Psychologist("Федоров Федор Федорович",4, 5.00, mapOf(
            "19.03.2023" to arrayListOf<String>("12:00","13:00", "14:00"),
            "20.03.2023" to arrayListOf<String>("15:00","16:00", "17:00"),
            "21.03.2023" to arrayListOf<String>("18:00","19:00", "20:00"),
        )),
)

val articlesDataList: ArrayList<Article> = arrayListOf(
    Article(
        "Как справиться с депрессией",
        "Данная статья помогает справиться с депрессией",
        "Для того, чтобы препятствовать развитию депрессии, нужно научиться преодолевать стрессовые ситуации. " +
                "Здоровый сон, взрослый человек должен спать не менее 8 часов в сутки. Больше двигаться, можно просто прогуляться " +
                "перед сном или несколько раз в неделю посещать бассейн. Не берите работу, которую не сможете выполнить в срок, ставьте " +
                "достижимые цели. Здоровый образ жизни, правильный режим работы и отдыха - вот что поможет бороться со стрессом и сохранить " +
                "душевное равновесие! Находите время для себя. Нужно находить время для своих увлечений, любимых книг и встреч с друзьями. " +
                "Положительные эмоции — основной фактор в профилактике депрессии."
    ),
    Article(
        "Как побороть тревожность",
        "Данная статья помогает побороть тревожность",
        "Сосредоточьтесь на своем дыхании. Сделайте глубокий вдох и выдох. Затем вдохните через нос, " +
                "считая до 4, и задержите дыхание, продолжая считать до 7. На счет 8 медленно выдохните. Повторите упражнение несколько раз.\n" +
                "\n" +
                "Включите успокаивающую музыку. Музыка может быть любая: классическая, для медитации, " +
                "звуки природы — главное, чтобы вам становилось спокойнее.\n" +
                "\n" +
                "Начните делать что-то руками. Уберите рабочий стол, порисуйте, начните вязать шарф, " +
                "мыть посуду... Сосредоточьтесь на любом активном действии, не сидите.\n" +
                "\n" +
                "Отвлекитесь от того, что вас тревожит. Если вы начали испытывать тревогу от просмотра новостей, " +
                "выключите телевизор, включите приятный фильм или видео, почитайте. Необходимо занять голову чем-то другим."
    ),
    Article("Как пережить расставание",
        "Данная статья помогает пережить расставание",
        "Если всё вокруг напоминает о бывшем партнёре, стоит задуматься о смене обстановки." +
                " Не получается уехать? Сделайте перестановку, купите новые шторы или посуду. " +
                "Изменение цветовой гаммы поможет настроиться на другой лад. Экспериментируйте."
    ),
)
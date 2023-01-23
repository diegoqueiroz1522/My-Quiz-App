package com.example.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestion():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        //1
        val que1 = Question(
            1,
            "Whats country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Uruguay",
            "Armenia",
            "Australia",
            1
        )
        questionList.add(que1)

        //2
        val que2 = Question(
            2,
            "Whats country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola",
            "Greece",
            "France",
            "Australia",
            4
        )
        questionList.add(que2)

        //3
        val que3 = Question(
            3,
            "Whats country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Poland",
            "Belgium",
            "Italy",
            "Austria",
            2
        )
        questionList.add(que3)

        //4
        val que4 = Question(
            4,
            "Whats country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil",
            "Venezuela",
            "Bolivia",
            "Peru",
            1
        )
        questionList.add(que4)

        //5
        val que5 = Question(
            5,
            "Whats country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Sweden",
            "Finland",
            "Denmark",
            "Norway",
            3
        )
        questionList.add(que5)

        //6
        val que6 = Question(
            6,
            "Whats country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji",
            "United Kingdom",
            "Cyprus",
            "Albain",
            1
        )
        questionList.add(que6)

        //7
        val que7 = Question(
            7,
            "Whats country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Bulgaria",
            "Hungary",
            "Germany",
            "Malta",
            3
        )
        questionList.add(que7)

        //8
        val que8 = Question(
            8,
            "Whats country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Sri Lanka",
            "Nepal",
            "India",
            "Pakistan",
            3
        )
        questionList.add(que8)

        //9
        val que9 = Question(
            9,
            "Whats country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kenia",
            "Kuwait",
            "Sudan",
            "Congo",
            2
        )
        questionList.add(que9)

        //10
        val que10 = Question(
            10,
            "Whats country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand",
            "Australia",
            "United Kingdom",
            "Est Timor",
            1
        )
        questionList.add(que10)

        return questionList
    }
}
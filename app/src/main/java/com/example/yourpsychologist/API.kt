package com.example.yourpsychologist

interface API {
    fun login(login: String, password: String): User?
    fun logout(login: String): Boolean
    fun register(login: String, password: String): Boolean
    fun getAllPsychologists(): ArrayList<Psychologist>
}

class APIImpl : API {
    override fun login(login: String, password: String): User? {
        val users = usersDataList
        for (user in users) {
            if (user.login == login && user.password == password) {
                return User(password, login)
            }
        }
        return null
    }

    override fun logout(login: String): Boolean {
        val users = usersDataList
        for (user in users) {
            if (user.login == login) {
                return true
            }
        }
        return false
    }

    override fun register(login: String, password: String): Boolean {
        val users = usersDataList
        for (user in users) {
            if (user.login == login) {
                return false
            }
        }
        usersDataList.add(User(password, login))
        return true
    }

    override fun getAllPsychologists(): ArrayList<Psychologist> {
        val psychologistsList = psychologistsDataList

        if(psychologistsList.isNotEmpty()) {
            return psychologistsList
        }

        return arrayListOf()
    }

//    override fun getScheduleByPsychologist(date: String, time: String): Boolean {
//
//    }
//
//    override fun getAppointmentsByUser(): Boolean {
//
//    }
//
//    override fun makeAppointment(date: String, time: String): Boolean {
//
//    }

}
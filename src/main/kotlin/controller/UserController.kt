package controller

import datasource.DataSource
import domain.UnregisteredUser
import domain.getByName
import domain.with
import javax.inject.Inject
import javax.validation.Valid

class UserController(
    @Inject val dataSource: DataSource
) {
    fun httpGet(@Valid unregisteredUser: UnregisteredUser) {
        val repo = UnregisteredUser.with(dataSource)

        if (repo.getByName(unregisteredUser.name) != null) {
            throw IllegalStateException("User already exists")
        } else {
            repo.save(unregisteredUser)
        }
    }
}

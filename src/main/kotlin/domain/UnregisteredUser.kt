package domain

import datasource.DataSource
import registry.Repository
import javax.validation.constraints.Min
import javax.validation.constraints.Size

data class UnregisteredUser(
    @Size(min = 5, message = "About Me must be between 10 and 200 characters")
    val name: String,
    @Min(value = 20, message = "Age should not be less than 20")
    val age: Int
) {
    companion object
}

fun UnregisteredUser.Companion.with(dataSource: DataSource) = Repository<UnregisteredUser>(dataSource)

/**
 * You can extend standard repo with any method
 */
fun Repository<UnregisteredUser>.getByName(name: String): UnregisteredUser? =
    dataSource.getSingle(UnregisteredUser::class.java) {
        "name" eq name
    }

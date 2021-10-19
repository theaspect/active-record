package datasource

class MySqlDataSource : DataSource {
    override fun <T> save(obj: T): T = TODO("Not yet implemented")
    override fun <T> getSingle(
        clazz: Class<T>,
        criteriaBuilder: Query.() -> Unit
    ): T = TODO("Not yet implemented")
    override fun <T> getMultiple(clazz: Class<T>): Collection<T> = TODO("Not yet implemented")
    override fun execute(): Unit = TODO("Not yet implemented")
}

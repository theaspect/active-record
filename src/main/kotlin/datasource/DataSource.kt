package datasource

interface DataSource {
    fun <T> save(obj: T): T
    fun <T> getSingle(clazz: Class<T>, criteriaBuilder: Query.() -> Unit): T?
    fun <T> getMultiple(clazz: Class<T>): Collection<T>
    fun execute()
}


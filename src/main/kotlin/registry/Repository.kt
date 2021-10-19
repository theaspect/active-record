package registry

import datasource.DataSource

class Repository<T>(
    val dataSource: DataSource
) {
    fun save(obj: T): T = dataSource.save(obj)
}

package datasource

interface Query {
    infix fun String.eq(value: Any)
}

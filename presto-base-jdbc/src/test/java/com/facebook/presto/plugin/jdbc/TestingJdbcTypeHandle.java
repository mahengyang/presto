/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.presto.plugin.jdbc;

import java.sql.Types;

public final class TestingJdbcTypeHandle
{
    private TestingJdbcTypeHandle() {}

    public static final JdbcTypeHandle JDBC_BOOLEAN = new JdbcTypeHandle(Types.BOOLEAN, false, 1, 0);

    public static final JdbcTypeHandle JDBC_SMALLINT = new JdbcTypeHandle(Types.SMALLINT, false, 1, 0);
    public static final JdbcTypeHandle JDBC_SMALLINT_UNSIGNED = new JdbcTypeHandle(Types.SMALLINT, true, 1, 0);
    public static final JdbcTypeHandle JDBC_TINYINT = new JdbcTypeHandle(Types.TINYINT, false, 2, 0);
    public static final JdbcTypeHandle JDBC_TINYINT_UNSIGNED = new JdbcTypeHandle(Types.TINYINT, true, 2, 0);
    public static final JdbcTypeHandle JDBC_INTEGER = new JdbcTypeHandle(Types.INTEGER, false, 4, 0);
    public static final JdbcTypeHandle JDBC_INTEGER_UNSIGNED = new JdbcTypeHandle(Types.INTEGER, true, 4, 0);
    public static final JdbcTypeHandle JDBC_BIGINT = new JdbcTypeHandle(Types.BIGINT, false, 8, 0);

    public static final JdbcTypeHandle JDBC_REAL = new JdbcTypeHandle(Types.REAL, false, 8, 0);
    public static final JdbcTypeHandle JDBC_DOUBLE = new JdbcTypeHandle(Types.DOUBLE, false, 8, 0);

    public static final JdbcTypeHandle JDBC_CHAR = new JdbcTypeHandle(Types.CHAR, false, 10, 0);
    public static final JdbcTypeHandle JDBC_VARCHAR = new JdbcTypeHandle(Types.VARCHAR, false, 10, 0);

    public static final JdbcTypeHandle JDBC_DATE = new JdbcTypeHandle(Types.DATE, false, 8, 0);
    public static final JdbcTypeHandle JDBC_TIME = new JdbcTypeHandle(Types.TIME, false, 4, 0);
    public static final JdbcTypeHandle JDBC_TIMESTAMP = new JdbcTypeHandle(Types.TIMESTAMP, false, 8, 0);
}

/**
 * This class is generated by jOOQ
 */
package org.jooq.test.adaptiveserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class TBookStore extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = 12108290;

	/**
	 * The singleton instance of t_book_store
	 */
	public static final org.jooq.test.adaptiveserver.generatedclasses.tables.TBookStore T_BOOK_STORE = new org.jooq.test.adaptiveserver.generatedclasses.tables.TBookStore();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookStoreRecord> __RECORD_TYPE = org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookStoreRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookStoreRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookStoreRecord, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookStoreRecord, java.lang.Integer>("id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK_STORE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookStoreRecord, java.lang.String> NAME = new org.jooq.impl.TableFieldImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookStoreRecord, java.lang.String>("name", org.jooq.impl.SQLDataType.VARCHAR, T_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookStore() {
		super("t_book_store", org.jooq.test.adaptiveserver.generatedclasses.Dbo.DBO);
	}

	@Override
	public org.jooq.Identity<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookStoreRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.adaptiveserver.generatedclasses.Keys.IDENTITY_t_book_store;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookStoreRecord> getMainKey() {
		return org.jooq.test.adaptiveserver.generatedclasses.Keys.uk_t_book_store_name;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookStoreRecord>>asList(org.jooq.test.adaptiveserver.generatedclasses.Keys.uk_t_book_store_name);
	}
}

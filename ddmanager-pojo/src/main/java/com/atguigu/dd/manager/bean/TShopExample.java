package com.atguigu.dd.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class TShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TShopExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopLevelIsNull() {
            addCriterion("shop_level is null");
            return (Criteria) this;
        }

        public Criteria andShopLevelIsNotNull() {
            addCriterion("shop_level is not null");
            return (Criteria) this;
        }

        public Criteria andShopLevelEqualTo(Integer value) {
            addCriterion("shop_level =", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelNotEqualTo(Integer value) {
            addCriterion("shop_level <>", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelGreaterThan(Integer value) {
            addCriterion("shop_level >", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_level >=", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelLessThan(Integer value) {
            addCriterion("shop_level <", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelLessThanOrEqualTo(Integer value) {
            addCriterion("shop_level <=", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelIn(List<Integer> values) {
            addCriterion("shop_level in", values, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelNotIn(List<Integer> values) {
            addCriterion("shop_level not in", values, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelBetween(Integer value1, Integer value2) {
            addCriterion("shop_level between", value1, value2, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_level not between", value1, value2, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopStatusIsNull() {
            addCriterion("shop_status is null");
            return (Criteria) this;
        }

        public Criteria andShopStatusIsNotNull() {
            addCriterion("shop_status is not null");
            return (Criteria) this;
        }

        public Criteria andShopStatusEqualTo(Integer value) {
            addCriterion("shop_status =", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotEqualTo(Integer value) {
            addCriterion("shop_status <>", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusGreaterThan(Integer value) {
            addCriterion("shop_status >", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_status >=", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusLessThan(Integer value) {
            addCriterion("shop_status <", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusLessThanOrEqualTo(Integer value) {
            addCriterion("shop_status <=", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusIn(List<Integer> values) {
            addCriterion("shop_status in", values, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotIn(List<Integer> values) {
            addCriterion("shop_status not in", values, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusBetween(Integer value1, Integer value2) {
            addCriterion("shop_status between", value1, value2, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_status not between", value1, value2, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNull() {
            addCriterion("sale_status is null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNotNull() {
            addCriterion("sale_status is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusEqualTo(Integer value) {
            addCriterion("sale_status =", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotEqualTo(Integer value) {
            addCriterion("sale_status <>", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThan(Integer value) {
            addCriterion("sale_status >", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_status >=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThan(Integer value) {
            addCriterion("sale_status <", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sale_status <=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIn(List<Integer> values) {
            addCriterion("sale_status in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotIn(List<Integer> values) {
            addCriterion("sale_status not in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusBetween(Integer value1, Integer value2) {
            addCriterion("sale_status between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_status not between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andShopAddIsNull() {
            addCriterion("shop_add is null");
            return (Criteria) this;
        }

        public Criteria andShopAddIsNotNull() {
            addCriterion("shop_add is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddEqualTo(String value) {
            addCriterion("shop_add =", value, "shopAdd");
            return (Criteria) this;
        }

        public Criteria andShopAddNotEqualTo(String value) {
            addCriterion("shop_add <>", value, "shopAdd");
            return (Criteria) this;
        }

        public Criteria andShopAddGreaterThan(String value) {
            addCriterion("shop_add >", value, "shopAdd");
            return (Criteria) this;
        }

        public Criteria andShopAddGreaterThanOrEqualTo(String value) {
            addCriterion("shop_add >=", value, "shopAdd");
            return (Criteria) this;
        }

        public Criteria andShopAddLessThan(String value) {
            addCriterion("shop_add <", value, "shopAdd");
            return (Criteria) this;
        }

        public Criteria andShopAddLessThanOrEqualTo(String value) {
            addCriterion("shop_add <=", value, "shopAdd");
            return (Criteria) this;
        }

        public Criteria andShopAddLike(String value) {
            addCriterion("shop_add like", value, "shopAdd");
            return (Criteria) this;
        }

        public Criteria andShopAddNotLike(String value) {
            addCriterion("shop_add not like", value, "shopAdd");
            return (Criteria) this;
        }

        public Criteria andShopAddIn(List<String> values) {
            addCriterion("shop_add in", values, "shopAdd");
            return (Criteria) this;
        }

        public Criteria andShopAddNotIn(List<String> values) {
            addCriterion("shop_add not in", values, "shopAdd");
            return (Criteria) this;
        }

        public Criteria andShopAddBetween(String value1, String value2) {
            addCriterion("shop_add between", value1, value2, "shopAdd");
            return (Criteria) this;
        }

        public Criteria andShopAddNotBetween(String value1, String value2) {
            addCriterion("shop_add not between", value1, value2, "shopAdd");
            return (Criteria) this;
        }

        public Criteria andShopAccountIsNull() {
            addCriterion("shop_account is null");
            return (Criteria) this;
        }

        public Criteria andShopAccountIsNotNull() {
            addCriterion("shop_account is not null");
            return (Criteria) this;
        }

        public Criteria andShopAccountEqualTo(String value) {
            addCriterion("shop_account =", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountNotEqualTo(String value) {
            addCriterion("shop_account <>", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountGreaterThan(String value) {
            addCriterion("shop_account >", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountGreaterThanOrEqualTo(String value) {
            addCriterion("shop_account >=", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountLessThan(String value) {
            addCriterion("shop_account <", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountLessThanOrEqualTo(String value) {
            addCriterion("shop_account <=", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountLike(String value) {
            addCriterion("shop_account like", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountNotLike(String value) {
            addCriterion("shop_account not like", value, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountIn(List<String> values) {
            addCriterion("shop_account in", values, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountNotIn(List<String> values) {
            addCriterion("shop_account not in", values, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountBetween(String value1, String value2) {
            addCriterion("shop_account between", value1, value2, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andShopAccountNotBetween(String value1, String value2) {
            addCriterion("shop_account not between", value1, value2, "shopAccount");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordIsNull() {
            addCriterion("account_password is null");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordIsNotNull() {
            addCriterion("account_password is not null");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordEqualTo(String value) {
            addCriterion("account_password =", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotEqualTo(String value) {
            addCriterion("account_password <>", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordGreaterThan(String value) {
            addCriterion("account_password >", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("account_password >=", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordLessThan(String value) {
            addCriterion("account_password <", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordLessThanOrEqualTo(String value) {
            addCriterion("account_password <=", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordLike(String value) {
            addCriterion("account_password like", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotLike(String value) {
            addCriterion("account_password not like", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordIn(List<String> values) {
            addCriterion("account_password in", values, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotIn(List<String> values) {
            addCriterion("account_password not in", values, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordBetween(String value1, String value2) {
            addCriterion("account_password between", value1, value2, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotBetween(String value1, String value2) {
            addCriterion("account_password not between", value1, value2, "accountPassword");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
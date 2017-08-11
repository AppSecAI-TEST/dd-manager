package com.atguigu.dd.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class TConcernShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TConcernShopExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andConcernStatusIsNull() {
            addCriterion("concern_status is null");
            return (Criteria) this;
        }

        public Criteria andConcernStatusIsNotNull() {
            addCriterion("concern_status is not null");
            return (Criteria) this;
        }

        public Criteria andConcernStatusEqualTo(Integer value) {
            addCriterion("concern_status =", value, "concernStatus");
            return (Criteria) this;
        }

        public Criteria andConcernStatusNotEqualTo(Integer value) {
            addCriterion("concern_status <>", value, "concernStatus");
            return (Criteria) this;
        }

        public Criteria andConcernStatusGreaterThan(Integer value) {
            addCriterion("concern_status >", value, "concernStatus");
            return (Criteria) this;
        }

        public Criteria andConcernStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("concern_status >=", value, "concernStatus");
            return (Criteria) this;
        }

        public Criteria andConcernStatusLessThan(Integer value) {
            addCriterion("concern_status <", value, "concernStatus");
            return (Criteria) this;
        }

        public Criteria andConcernStatusLessThanOrEqualTo(Integer value) {
            addCriterion("concern_status <=", value, "concernStatus");
            return (Criteria) this;
        }

        public Criteria andConcernStatusIn(List<Integer> values) {
            addCriterion("concern_status in", values, "concernStatus");
            return (Criteria) this;
        }

        public Criteria andConcernStatusNotIn(List<Integer> values) {
            addCriterion("concern_status not in", values, "concernStatus");
            return (Criteria) this;
        }

        public Criteria andConcernStatusBetween(Integer value1, Integer value2) {
            addCriterion("concern_status between", value1, value2, "concernStatus");
            return (Criteria) this;
        }

        public Criteria andConcernStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("concern_status not between", value1, value2, "concernStatus");
            return (Criteria) this;
        }

        public Criteria andWanttoStatusIsNull() {
            addCriterion("wantto_status is null");
            return (Criteria) this;
        }

        public Criteria andWanttoStatusIsNotNull() {
            addCriterion("wantto_status is not null");
            return (Criteria) this;
        }

        public Criteria andWanttoStatusEqualTo(Integer value) {
            addCriterion("wantto_status =", value, "wanttoStatus");
            return (Criteria) this;
        }

        public Criteria andWanttoStatusNotEqualTo(Integer value) {
            addCriterion("wantto_status <>", value, "wanttoStatus");
            return (Criteria) this;
        }

        public Criteria andWanttoStatusGreaterThan(Integer value) {
            addCriterion("wantto_status >", value, "wanttoStatus");
            return (Criteria) this;
        }

        public Criteria andWanttoStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("wantto_status >=", value, "wanttoStatus");
            return (Criteria) this;
        }

        public Criteria andWanttoStatusLessThan(Integer value) {
            addCriterion("wantto_status <", value, "wanttoStatus");
            return (Criteria) this;
        }

        public Criteria andWanttoStatusLessThanOrEqualTo(Integer value) {
            addCriterion("wantto_status <=", value, "wanttoStatus");
            return (Criteria) this;
        }

        public Criteria andWanttoStatusIn(List<Integer> values) {
            addCriterion("wantto_status in", values, "wanttoStatus");
            return (Criteria) this;
        }

        public Criteria andWanttoStatusNotIn(List<Integer> values) {
            addCriterion("wantto_status not in", values, "wanttoStatus");
            return (Criteria) this;
        }

        public Criteria andWanttoStatusBetween(Integer value1, Integer value2) {
            addCriterion("wantto_status between", value1, value2, "wanttoStatus");
            return (Criteria) this;
        }

        public Criteria andWanttoStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("wantto_status not between", value1, value2, "wanttoStatus");
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
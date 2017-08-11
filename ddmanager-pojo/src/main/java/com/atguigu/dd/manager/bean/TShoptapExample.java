package com.atguigu.dd.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class TShoptapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TShoptapExample() {
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

        public Criteria andTapIdIsNull() {
            addCriterion("tap_id is null");
            return (Criteria) this;
        }

        public Criteria andTapIdIsNotNull() {
            addCriterion("tap_id is not null");
            return (Criteria) this;
        }

        public Criteria andTapIdEqualTo(Integer value) {
            addCriterion("tap_id =", value, "tapId");
            return (Criteria) this;
        }

        public Criteria andTapIdNotEqualTo(Integer value) {
            addCriterion("tap_id <>", value, "tapId");
            return (Criteria) this;
        }

        public Criteria andTapIdGreaterThan(Integer value) {
            addCriterion("tap_id >", value, "tapId");
            return (Criteria) this;
        }

        public Criteria andTapIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tap_id >=", value, "tapId");
            return (Criteria) this;
        }

        public Criteria andTapIdLessThan(Integer value) {
            addCriterion("tap_id <", value, "tapId");
            return (Criteria) this;
        }

        public Criteria andTapIdLessThanOrEqualTo(Integer value) {
            addCriterion("tap_id <=", value, "tapId");
            return (Criteria) this;
        }

        public Criteria andTapIdIn(List<Integer> values) {
            addCriterion("tap_id in", values, "tapId");
            return (Criteria) this;
        }

        public Criteria andTapIdNotIn(List<Integer> values) {
            addCriterion("tap_id not in", values, "tapId");
            return (Criteria) this;
        }

        public Criteria andTapIdBetween(Integer value1, Integer value2) {
            addCriterion("tap_id between", value1, value2, "tapId");
            return (Criteria) this;
        }

        public Criteria andTapIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tap_id not between", value1, value2, "tapId");
            return (Criteria) this;
        }

        public Criteria andTapNameIsNull() {
            addCriterion("tap_name is null");
            return (Criteria) this;
        }

        public Criteria andTapNameIsNotNull() {
            addCriterion("tap_name is not null");
            return (Criteria) this;
        }

        public Criteria andTapNameEqualTo(String value) {
            addCriterion("tap_name =", value, "tapName");
            return (Criteria) this;
        }

        public Criteria andTapNameNotEqualTo(String value) {
            addCriterion("tap_name <>", value, "tapName");
            return (Criteria) this;
        }

        public Criteria andTapNameGreaterThan(String value) {
            addCriterion("tap_name >", value, "tapName");
            return (Criteria) this;
        }

        public Criteria andTapNameGreaterThanOrEqualTo(String value) {
            addCriterion("tap_name >=", value, "tapName");
            return (Criteria) this;
        }

        public Criteria andTapNameLessThan(String value) {
            addCriterion("tap_name <", value, "tapName");
            return (Criteria) this;
        }

        public Criteria andTapNameLessThanOrEqualTo(String value) {
            addCriterion("tap_name <=", value, "tapName");
            return (Criteria) this;
        }

        public Criteria andTapNameLike(String value) {
            addCriterion("tap_name like", value, "tapName");
            return (Criteria) this;
        }

        public Criteria andTapNameNotLike(String value) {
            addCriterion("tap_name not like", value, "tapName");
            return (Criteria) this;
        }

        public Criteria andTapNameIn(List<String> values) {
            addCriterion("tap_name in", values, "tapName");
            return (Criteria) this;
        }

        public Criteria andTapNameNotIn(List<String> values) {
            addCriterion("tap_name not in", values, "tapName");
            return (Criteria) this;
        }

        public Criteria andTapNameBetween(String value1, String value2) {
            addCriterion("tap_name between", value1, value2, "tapName");
            return (Criteria) this;
        }

        public Criteria andTapNameNotBetween(String value1, String value2) {
            addCriterion("tap_name not between", value1, value2, "tapName");
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
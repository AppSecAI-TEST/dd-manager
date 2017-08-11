package com.atguigu.dd.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDevelopmentCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDevelopmentCommentExample() {
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

        public Criteria andDevelopmentIdIsNull() {
            addCriterion("development_id is null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentIdIsNotNull() {
            addCriterion("development_id is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentIdEqualTo(Integer value) {
            addCriterion("development_id =", value, "developmentId");
            return (Criteria) this;
        }

        public Criteria andDevelopmentIdNotEqualTo(Integer value) {
            addCriterion("development_id <>", value, "developmentId");
            return (Criteria) this;
        }

        public Criteria andDevelopmentIdGreaterThan(Integer value) {
            addCriterion("development_id >", value, "developmentId");
            return (Criteria) this;
        }

        public Criteria andDevelopmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("development_id >=", value, "developmentId");
            return (Criteria) this;
        }

        public Criteria andDevelopmentIdLessThan(Integer value) {
            addCriterion("development_id <", value, "developmentId");
            return (Criteria) this;
        }

        public Criteria andDevelopmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("development_id <=", value, "developmentId");
            return (Criteria) this;
        }

        public Criteria andDevelopmentIdIn(List<Integer> values) {
            addCriterion("development_id in", values, "developmentId");
            return (Criteria) this;
        }

        public Criteria andDevelopmentIdNotIn(List<Integer> values) {
            addCriterion("development_id not in", values, "developmentId");
            return (Criteria) this;
        }

        public Criteria andDevelopmentIdBetween(Integer value1, Integer value2) {
            addCriterion("development_id between", value1, value2, "developmentId");
            return (Criteria) this;
        }

        public Criteria andDevelopmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("development_id not between", value1, value2, "developmentId");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNull() {
            addCriterion("comment_date is null");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNotNull() {
            addCriterion("comment_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDateEqualTo(Date value) {
            addCriterion("comment_date =", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotEqualTo(Date value) {
            addCriterion("comment_date <>", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThan(Date value) {
            addCriterion("comment_date >", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_date >=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThan(Date value) {
            addCriterion("comment_date <", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThanOrEqualTo(Date value) {
            addCriterion("comment_date <=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateIn(List<Date> values) {
            addCriterion("comment_date in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotIn(List<Date> values) {
            addCriterion("comment_date not in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateBetween(Date value1, Date value2) {
            addCriterion("comment_date between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotBetween(Date value1, Date value2) {
            addCriterion("comment_date not between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentMessageIsNull() {
            addCriterion("comment_message is null");
            return (Criteria) this;
        }

        public Criteria andCommentMessageIsNotNull() {
            addCriterion("comment_message is not null");
            return (Criteria) this;
        }

        public Criteria andCommentMessageEqualTo(String value) {
            addCriterion("comment_message =", value, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageNotEqualTo(String value) {
            addCriterion("comment_message <>", value, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageGreaterThan(String value) {
            addCriterion("comment_message >", value, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageGreaterThanOrEqualTo(String value) {
            addCriterion("comment_message >=", value, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageLessThan(String value) {
            addCriterion("comment_message <", value, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageLessThanOrEqualTo(String value) {
            addCriterion("comment_message <=", value, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageLike(String value) {
            addCriterion("comment_message like", value, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageNotLike(String value) {
            addCriterion("comment_message not like", value, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageIn(List<String> values) {
            addCriterion("comment_message in", values, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageNotIn(List<String> values) {
            addCriterion("comment_message not in", values, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageBetween(String value1, String value2) {
            addCriterion("comment_message between", value1, value2, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageNotBetween(String value1, String value2) {
            addCriterion("comment_message not between", value1, value2, "commentMessage");
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
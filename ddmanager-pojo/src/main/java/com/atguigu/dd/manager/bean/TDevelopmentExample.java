package com.atguigu.dd.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDevelopmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDevelopmentExample() {
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

        public Criteria andDevelopmentMessageIsNull() {
            addCriterion("development_message is null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentMessageIsNotNull() {
            addCriterion("development_message is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentMessageEqualTo(String value) {
            addCriterion("development_message =", value, "developmentMessage");
            return (Criteria) this;
        }

        public Criteria andDevelopmentMessageNotEqualTo(String value) {
            addCriterion("development_message <>", value, "developmentMessage");
            return (Criteria) this;
        }

        public Criteria andDevelopmentMessageGreaterThan(String value) {
            addCriterion("development_message >", value, "developmentMessage");
            return (Criteria) this;
        }

        public Criteria andDevelopmentMessageGreaterThanOrEqualTo(String value) {
            addCriterion("development_message >=", value, "developmentMessage");
            return (Criteria) this;
        }

        public Criteria andDevelopmentMessageLessThan(String value) {
            addCriterion("development_message <", value, "developmentMessage");
            return (Criteria) this;
        }

        public Criteria andDevelopmentMessageLessThanOrEqualTo(String value) {
            addCriterion("development_message <=", value, "developmentMessage");
            return (Criteria) this;
        }

        public Criteria andDevelopmentMessageLike(String value) {
            addCriterion("development_message like", value, "developmentMessage");
            return (Criteria) this;
        }

        public Criteria andDevelopmentMessageNotLike(String value) {
            addCriterion("development_message not like", value, "developmentMessage");
            return (Criteria) this;
        }

        public Criteria andDevelopmentMessageIn(List<String> values) {
            addCriterion("development_message in", values, "developmentMessage");
            return (Criteria) this;
        }

        public Criteria andDevelopmentMessageNotIn(List<String> values) {
            addCriterion("development_message not in", values, "developmentMessage");
            return (Criteria) this;
        }

        public Criteria andDevelopmentMessageBetween(String value1, String value2) {
            addCriterion("development_message between", value1, value2, "developmentMessage");
            return (Criteria) this;
        }

        public Criteria andDevelopmentMessageNotBetween(String value1, String value2) {
            addCriterion("development_message not between", value1, value2, "developmentMessage");
            return (Criteria) this;
        }

        public Criteria andDevelopmentsDateIsNull() {
            addCriterion("developments_date is null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentsDateIsNotNull() {
            addCriterion("developments_date is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentsDateEqualTo(Date value) {
            addCriterion("developments_date =", value, "developmentsDate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentsDateNotEqualTo(Date value) {
            addCriterion("developments_date <>", value, "developmentsDate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentsDateGreaterThan(Date value) {
            addCriterion("developments_date >", value, "developmentsDate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("developments_date >=", value, "developmentsDate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentsDateLessThan(Date value) {
            addCriterion("developments_date <", value, "developmentsDate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentsDateLessThanOrEqualTo(Date value) {
            addCriterion("developments_date <=", value, "developmentsDate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentsDateIn(List<Date> values) {
            addCriterion("developments_date in", values, "developmentsDate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentsDateNotIn(List<Date> values) {
            addCriterion("developments_date not in", values, "developmentsDate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentsDateBetween(Date value1, Date value2) {
            addCriterion("developments_date between", value1, value2, "developmentsDate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentsDateNotBetween(Date value1, Date value2) {
            addCriterion("developments_date not between", value1, value2, "developmentsDate");
            return (Criteria) this;
        }

        public Criteria andIsvideoIsNull() {
            addCriterion("isvideo is null");
            return (Criteria) this;
        }

        public Criteria andIsvideoIsNotNull() {
            addCriterion("isvideo is not null");
            return (Criteria) this;
        }

        public Criteria andIsvideoEqualTo(Integer value) {
            addCriterion("isvideo =", value, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoNotEqualTo(Integer value) {
            addCriterion("isvideo <>", value, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoGreaterThan(Integer value) {
            addCriterion("isvideo >", value, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoGreaterThanOrEqualTo(Integer value) {
            addCriterion("isvideo >=", value, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoLessThan(Integer value) {
            addCriterion("isvideo <", value, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoLessThanOrEqualTo(Integer value) {
            addCriterion("isvideo <=", value, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoIn(List<Integer> values) {
            addCriterion("isvideo in", values, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoNotIn(List<Integer> values) {
            addCriterion("isvideo not in", values, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoBetween(Integer value1, Integer value2) {
            addCriterion("isvideo between", value1, value2, "isvideo");
            return (Criteria) this;
        }

        public Criteria andIsvideoNotBetween(Integer value1, Integer value2) {
            addCriterion("isvideo not between", value1, value2, "isvideo");
            return (Criteria) this;
        }

        public Criteria andVideoAddIsNull() {
            addCriterion("video_add is null");
            return (Criteria) this;
        }

        public Criteria andVideoAddIsNotNull() {
            addCriterion("video_add is not null");
            return (Criteria) this;
        }

        public Criteria andVideoAddEqualTo(String value) {
            addCriterion("video_add =", value, "videoAdd");
            return (Criteria) this;
        }

        public Criteria andVideoAddNotEqualTo(String value) {
            addCriterion("video_add <>", value, "videoAdd");
            return (Criteria) this;
        }

        public Criteria andVideoAddGreaterThan(String value) {
            addCriterion("video_add >", value, "videoAdd");
            return (Criteria) this;
        }

        public Criteria andVideoAddGreaterThanOrEqualTo(String value) {
            addCriterion("video_add >=", value, "videoAdd");
            return (Criteria) this;
        }

        public Criteria andVideoAddLessThan(String value) {
            addCriterion("video_add <", value, "videoAdd");
            return (Criteria) this;
        }

        public Criteria andVideoAddLessThanOrEqualTo(String value) {
            addCriterion("video_add <=", value, "videoAdd");
            return (Criteria) this;
        }

        public Criteria andVideoAddLike(String value) {
            addCriterion("video_add like", value, "videoAdd");
            return (Criteria) this;
        }

        public Criteria andVideoAddNotLike(String value) {
            addCriterion("video_add not like", value, "videoAdd");
            return (Criteria) this;
        }

        public Criteria andVideoAddIn(List<String> values) {
            addCriterion("video_add in", values, "videoAdd");
            return (Criteria) this;
        }

        public Criteria andVideoAddNotIn(List<String> values) {
            addCriterion("video_add not in", values, "videoAdd");
            return (Criteria) this;
        }

        public Criteria andVideoAddBetween(String value1, String value2) {
            addCriterion("video_add between", value1, value2, "videoAdd");
            return (Criteria) this;
        }

        public Criteria andVideoAddNotBetween(String value1, String value2) {
            addCriterion("video_add not between", value1, value2, "videoAdd");
            return (Criteria) this;
        }

        public Criteria andDevelopmentStatusIsNull() {
            addCriterion("development_status is null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentStatusIsNotNull() {
            addCriterion("development_status is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentStatusEqualTo(Integer value) {
            addCriterion("development_status =", value, "developmentStatus");
            return (Criteria) this;
        }

        public Criteria andDevelopmentStatusNotEqualTo(Integer value) {
            addCriterion("development_status <>", value, "developmentStatus");
            return (Criteria) this;
        }

        public Criteria andDevelopmentStatusGreaterThan(Integer value) {
            addCriterion("development_status >", value, "developmentStatus");
            return (Criteria) this;
        }

        public Criteria andDevelopmentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("development_status >=", value, "developmentStatus");
            return (Criteria) this;
        }

        public Criteria andDevelopmentStatusLessThan(Integer value) {
            addCriterion("development_status <", value, "developmentStatus");
            return (Criteria) this;
        }

        public Criteria andDevelopmentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("development_status <=", value, "developmentStatus");
            return (Criteria) this;
        }

        public Criteria andDevelopmentStatusIn(List<Integer> values) {
            addCriterion("development_status in", values, "developmentStatus");
            return (Criteria) this;
        }

        public Criteria andDevelopmentStatusNotIn(List<Integer> values) {
            addCriterion("development_status not in", values, "developmentStatus");
            return (Criteria) this;
        }

        public Criteria andDevelopmentStatusBetween(Integer value1, Integer value2) {
            addCriterion("development_status between", value1, value2, "developmentStatus");
            return (Criteria) this;
        }

        public Criteria andDevelopmentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("development_status not between", value1, value2, "developmentStatus");
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
package com.atguigu.dd.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMessageExample() {
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

        public Criteria andOtherUserIdIsNull() {
            addCriterion("other_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdIsNotNull() {
            addCriterion("other_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdEqualTo(Integer value) {
            addCriterion("other_user_id =", value, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdNotEqualTo(Integer value) {
            addCriterion("other_user_id <>", value, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdGreaterThan(Integer value) {
            addCriterion("other_user_id >", value, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_user_id >=", value, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdLessThan(Integer value) {
            addCriterion("other_user_id <", value, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("other_user_id <=", value, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdIn(List<Integer> values) {
            addCriterion("other_user_id in", values, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdNotIn(List<Integer> values) {
            addCriterion("other_user_id not in", values, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdBetween(Integer value1, Integer value2) {
            addCriterion("other_user_id between", value1, value2, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andOtherUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("other_user_id not between", value1, value2, "otherUserId");
            return (Criteria) this;
        }

        public Criteria andMessagesIsNull() {
            addCriterion("messages is null");
            return (Criteria) this;
        }

        public Criteria andMessagesIsNotNull() {
            addCriterion("messages is not null");
            return (Criteria) this;
        }

        public Criteria andMessagesEqualTo(String value) {
            addCriterion("messages =", value, "messages");
            return (Criteria) this;
        }

        public Criteria andMessagesNotEqualTo(String value) {
            addCriterion("messages <>", value, "messages");
            return (Criteria) this;
        }

        public Criteria andMessagesGreaterThan(String value) {
            addCriterion("messages >", value, "messages");
            return (Criteria) this;
        }

        public Criteria andMessagesGreaterThanOrEqualTo(String value) {
            addCriterion("messages >=", value, "messages");
            return (Criteria) this;
        }

        public Criteria andMessagesLessThan(String value) {
            addCriterion("messages <", value, "messages");
            return (Criteria) this;
        }

        public Criteria andMessagesLessThanOrEqualTo(String value) {
            addCriterion("messages <=", value, "messages");
            return (Criteria) this;
        }

        public Criteria andMessagesLike(String value) {
            addCriterion("messages like", value, "messages");
            return (Criteria) this;
        }

        public Criteria andMessagesNotLike(String value) {
            addCriterion("messages not like", value, "messages");
            return (Criteria) this;
        }

        public Criteria andMessagesIn(List<String> values) {
            addCriterion("messages in", values, "messages");
            return (Criteria) this;
        }

        public Criteria andMessagesNotIn(List<String> values) {
            addCriterion("messages not in", values, "messages");
            return (Criteria) this;
        }

        public Criteria andMessagesBetween(String value1, String value2) {
            addCriterion("messages between", value1, value2, "messages");
            return (Criteria) this;
        }

        public Criteria andMessagesNotBetween(String value1, String value2) {
            addCriterion("messages not between", value1, value2, "messages");
            return (Criteria) this;
        }

        public Criteria andMessageStatusIsNull() {
            addCriterion("message_status is null");
            return (Criteria) this;
        }

        public Criteria andMessageStatusIsNotNull() {
            addCriterion("message_status is not null");
            return (Criteria) this;
        }

        public Criteria andMessageStatusEqualTo(Integer value) {
            addCriterion("message_status =", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusNotEqualTo(Integer value) {
            addCriterion("message_status <>", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusGreaterThan(Integer value) {
            addCriterion("message_status >", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_status >=", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusLessThan(Integer value) {
            addCriterion("message_status <", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusLessThanOrEqualTo(Integer value) {
            addCriterion("message_status <=", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusIn(List<Integer> values) {
            addCriterion("message_status in", values, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusNotIn(List<Integer> values) {
            addCriterion("message_status not in", values, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusBetween(Integer value1, Integer value2) {
            addCriterion("message_status between", value1, value2, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("message_status not between", value1, value2, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIsNull() {
            addCriterion("message_time is null");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIsNotNull() {
            addCriterion("message_time is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTimeEqualTo(Date value) {
            addCriterion("message_time =", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotEqualTo(Date value) {
            addCriterion("message_time <>", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeGreaterThan(Date value) {
            addCriterion("message_time >", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("message_time >=", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeLessThan(Date value) {
            addCriterion("message_time <", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeLessThanOrEqualTo(Date value) {
            addCriterion("message_time <=", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIn(List<Date> values) {
            addCriterion("message_time in", values, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotIn(List<Date> values) {
            addCriterion("message_time not in", values, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeBetween(Date value1, Date value2) {
            addCriterion("message_time between", value1, value2, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotBetween(Date value1, Date value2) {
            addCriterion("message_time not between", value1, value2, "messageTime");
            return (Criteria) this;
        }

        public Criteria andIsreadIsNull() {
            addCriterion("isread is null");
            return (Criteria) this;
        }

        public Criteria andIsreadIsNotNull() {
            addCriterion("isread is not null");
            return (Criteria) this;
        }

        public Criteria andIsreadEqualTo(Integer value) {
            addCriterion("isread =", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotEqualTo(Integer value) {
            addCriterion("isread <>", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadGreaterThan(Integer value) {
            addCriterion("isread >", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadGreaterThanOrEqualTo(Integer value) {
            addCriterion("isread >=", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadLessThan(Integer value) {
            addCriterion("isread <", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadLessThanOrEqualTo(Integer value) {
            addCriterion("isread <=", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadIn(List<Integer> values) {
            addCriterion("isread in", values, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotIn(List<Integer> values) {
            addCriterion("isread not in", values, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadBetween(Integer value1, Integer value2) {
            addCriterion("isread between", value1, value2, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotBetween(Integer value1, Integer value2) {
            addCriterion("isread not between", value1, value2, "isread");
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
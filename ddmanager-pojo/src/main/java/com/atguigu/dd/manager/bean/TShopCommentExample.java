package com.atguigu.dd.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TShopCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TShopCommentExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
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

        public Criteria andDishIdIsNull() {
            addCriterion("dish_id is null");
            return (Criteria) this;
        }

        public Criteria andDishIdIsNotNull() {
            addCriterion("dish_id is not null");
            return (Criteria) this;
        }

        public Criteria andDishIdEqualTo(Integer value) {
            addCriterion("dish_id =", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotEqualTo(Integer value) {
            addCriterion("dish_id <>", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdGreaterThan(Integer value) {
            addCriterion("dish_id >", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dish_id >=", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdLessThan(Integer value) {
            addCriterion("dish_id <", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdLessThanOrEqualTo(Integer value) {
            addCriterion("dish_id <=", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdIn(List<Integer> values) {
            addCriterion("dish_id in", values, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotIn(List<Integer> values) {
            addCriterion("dish_id not in", values, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdBetween(Integer value1, Integer value2) {
            addCriterion("dish_id between", value1, value2, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dish_id not between", value1, value2, "dishId");
            return (Criteria) this;
        }

        public Criteria andCommentInfoIsNull() {
            addCriterion("comment_info is null");
            return (Criteria) this;
        }

        public Criteria andCommentInfoIsNotNull() {
            addCriterion("comment_info is not null");
            return (Criteria) this;
        }

        public Criteria andCommentInfoEqualTo(String value) {
            addCriterion("comment_info =", value, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoNotEqualTo(String value) {
            addCriterion("comment_info <>", value, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoGreaterThan(String value) {
            addCriterion("comment_info >", value, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoGreaterThanOrEqualTo(String value) {
            addCriterion("comment_info >=", value, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoLessThan(String value) {
            addCriterion("comment_info <", value, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoLessThanOrEqualTo(String value) {
            addCriterion("comment_info <=", value, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoLike(String value) {
            addCriterion("comment_info like", value, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoNotLike(String value) {
            addCriterion("comment_info not like", value, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoIn(List<String> values) {
            addCriterion("comment_info in", values, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoNotIn(List<String> values) {
            addCriterion("comment_info not in", values, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoBetween(String value1, String value2) {
            addCriterion("comment_info between", value1, value2, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentInfoNotBetween(String value1, String value2) {
            addCriterion("comment_info not between", value1, value2, "commentInfo");
            return (Criteria) this;
        }

        public Criteria andCommentDataIsNull() {
            addCriterion("comment_data is null");
            return (Criteria) this;
        }

        public Criteria andCommentDataIsNotNull() {
            addCriterion("comment_data is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDataEqualTo(Date value) {
            addCriterion("comment_data =", value, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataNotEqualTo(Date value) {
            addCriterion("comment_data <>", value, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataGreaterThan(Date value) {
            addCriterion("comment_data >", value, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_data >=", value, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataLessThan(Date value) {
            addCriterion("comment_data <", value, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataLessThanOrEqualTo(Date value) {
            addCriterion("comment_data <=", value, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataIn(List<Date> values) {
            addCriterion("comment_data in", values, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataNotIn(List<Date> values) {
            addCriterion("comment_data not in", values, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataBetween(Date value1, Date value2) {
            addCriterion("comment_data between", value1, value2, "commentData");
            return (Criteria) this;
        }

        public Criteria andCommentDataNotBetween(Date value1, Date value2) {
            addCriterion("comment_data not between", value1, value2, "commentData");
            return (Criteria) this;
        }

        public Criteria andThumbStatusIsNull() {
            addCriterion("thumb_status is null");
            return (Criteria) this;
        }

        public Criteria andThumbStatusIsNotNull() {
            addCriterion("thumb_status is not null");
            return (Criteria) this;
        }

        public Criteria andThumbStatusEqualTo(Integer value) {
            addCriterion("thumb_status =", value, "thumbStatus");
            return (Criteria) this;
        }

        public Criteria andThumbStatusNotEqualTo(Integer value) {
            addCriterion("thumb_status <>", value, "thumbStatus");
            return (Criteria) this;
        }

        public Criteria andThumbStatusGreaterThan(Integer value) {
            addCriterion("thumb_status >", value, "thumbStatus");
            return (Criteria) this;
        }

        public Criteria andThumbStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("thumb_status >=", value, "thumbStatus");
            return (Criteria) this;
        }

        public Criteria andThumbStatusLessThan(Integer value) {
            addCriterion("thumb_status <", value, "thumbStatus");
            return (Criteria) this;
        }

        public Criteria andThumbStatusLessThanOrEqualTo(Integer value) {
            addCriterion("thumb_status <=", value, "thumbStatus");
            return (Criteria) this;
        }

        public Criteria andThumbStatusIn(List<Integer> values) {
            addCriterion("thumb_status in", values, "thumbStatus");
            return (Criteria) this;
        }

        public Criteria andThumbStatusNotIn(List<Integer> values) {
            addCriterion("thumb_status not in", values, "thumbStatus");
            return (Criteria) this;
        }

        public Criteria andThumbStatusBetween(Integer value1, Integer value2) {
            addCriterion("thumb_status between", value1, value2, "thumbStatus");
            return (Criteria) this;
        }

        public Criteria andThumbStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("thumb_status not between", value1, value2, "thumbStatus");
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
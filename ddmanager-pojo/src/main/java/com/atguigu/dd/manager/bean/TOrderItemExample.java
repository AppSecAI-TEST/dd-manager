package com.atguigu.dd.manager.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TOrderItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOrderItemExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andDishPriceIsNull() {
            addCriterion("dish_price is null");
            return (Criteria) this;
        }

        public Criteria andDishPriceIsNotNull() {
            addCriterion("dish_price is not null");
            return (Criteria) this;
        }

        public Criteria andDishPriceEqualTo(BigDecimal value) {
            addCriterion("dish_price =", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceNotEqualTo(BigDecimal value) {
            addCriterion("dish_price <>", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceGreaterThan(BigDecimal value) {
            addCriterion("dish_price >", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dish_price >=", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceLessThan(BigDecimal value) {
            addCriterion("dish_price <", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dish_price <=", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceIn(List<BigDecimal> values) {
            addCriterion("dish_price in", values, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceNotIn(List<BigDecimal> values) {
            addCriterion("dish_price not in", values, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dish_price between", value1, value2, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dish_price not between", value1, value2, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishCountIsNull() {
            addCriterion("dish_count is null");
            return (Criteria) this;
        }

        public Criteria andDishCountIsNotNull() {
            addCriterion("dish_count is not null");
            return (Criteria) this;
        }

        public Criteria andDishCountEqualTo(Integer value) {
            addCriterion("dish_count =", value, "dishCount");
            return (Criteria) this;
        }

        public Criteria andDishCountNotEqualTo(Integer value) {
            addCriterion("dish_count <>", value, "dishCount");
            return (Criteria) this;
        }

        public Criteria andDishCountGreaterThan(Integer value) {
            addCriterion("dish_count >", value, "dishCount");
            return (Criteria) this;
        }

        public Criteria andDishCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("dish_count >=", value, "dishCount");
            return (Criteria) this;
        }

        public Criteria andDishCountLessThan(Integer value) {
            addCriterion("dish_count <", value, "dishCount");
            return (Criteria) this;
        }

        public Criteria andDishCountLessThanOrEqualTo(Integer value) {
            addCriterion("dish_count <=", value, "dishCount");
            return (Criteria) this;
        }

        public Criteria andDishCountIn(List<Integer> values) {
            addCriterion("dish_count in", values, "dishCount");
            return (Criteria) this;
        }

        public Criteria andDishCountNotIn(List<Integer> values) {
            addCriterion("dish_count not in", values, "dishCount");
            return (Criteria) this;
        }

        public Criteria andDishCountBetween(Integer value1, Integer value2) {
            addCriterion("dish_count between", value1, value2, "dishCount");
            return (Criteria) this;
        }

        public Criteria andDishCountNotBetween(Integer value1, Integer value2) {
            addCriterion("dish_count not between", value1, value2, "dishCount");
            return (Criteria) this;
        }

        public Criteria andDishTotalIsNull() {
            addCriterion("dish_total is null");
            return (Criteria) this;
        }

        public Criteria andDishTotalIsNotNull() {
            addCriterion("dish_total is not null");
            return (Criteria) this;
        }

        public Criteria andDishTotalEqualTo(Long value) {
            addCriterion("dish_total =", value, "dishTotal");
            return (Criteria) this;
        }

        public Criteria andDishTotalNotEqualTo(Long value) {
            addCriterion("dish_total <>", value, "dishTotal");
            return (Criteria) this;
        }

        public Criteria andDishTotalGreaterThan(Long value) {
            addCriterion("dish_total >", value, "dishTotal");
            return (Criteria) this;
        }

        public Criteria andDishTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("dish_total >=", value, "dishTotal");
            return (Criteria) this;
        }

        public Criteria andDishTotalLessThan(Long value) {
            addCriterion("dish_total <", value, "dishTotal");
            return (Criteria) this;
        }

        public Criteria andDishTotalLessThanOrEqualTo(Long value) {
            addCriterion("dish_total <=", value, "dishTotal");
            return (Criteria) this;
        }

        public Criteria andDishTotalIn(List<Long> values) {
            addCriterion("dish_total in", values, "dishTotal");
            return (Criteria) this;
        }

        public Criteria andDishTotalNotIn(List<Long> values) {
            addCriterion("dish_total not in", values, "dishTotal");
            return (Criteria) this;
        }

        public Criteria andDishTotalBetween(Long value1, Long value2) {
            addCriterion("dish_total between", value1, value2, "dishTotal");
            return (Criteria) this;
        }

        public Criteria andDishTotalNotBetween(Long value1, Long value2) {
            addCriterion("dish_total not between", value1, value2, "dishTotal");
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
package com.atguigu.dd.manager.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TDishSingleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDishSingleExample() {
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

        public Criteria andDishNameIsNull() {
            addCriterion("dish_name is null");
            return (Criteria) this;
        }

        public Criteria andDishNameIsNotNull() {
            addCriterion("dish_name is not null");
            return (Criteria) this;
        }

        public Criteria andDishNameEqualTo(String value) {
            addCriterion("dish_name =", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameNotEqualTo(String value) {
            addCriterion("dish_name <>", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameGreaterThan(String value) {
            addCriterion("dish_name >", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameGreaterThanOrEqualTo(String value) {
            addCriterion("dish_name >=", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameLessThan(String value) {
            addCriterion("dish_name <", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameLessThanOrEqualTo(String value) {
            addCriterion("dish_name <=", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameLike(String value) {
            addCriterion("dish_name like", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameNotLike(String value) {
            addCriterion("dish_name not like", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameIn(List<String> values) {
            addCriterion("dish_name in", values, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameNotIn(List<String> values) {
            addCriterion("dish_name not in", values, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameBetween(String value1, String value2) {
            addCriterion("dish_name between", value1, value2, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameNotBetween(String value1, String value2) {
            addCriterion("dish_name not between", value1, value2, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishIntroIsNull() {
            addCriterion("dish_intro is null");
            return (Criteria) this;
        }

        public Criteria andDishIntroIsNotNull() {
            addCriterion("dish_intro is not null");
            return (Criteria) this;
        }

        public Criteria andDishIntroEqualTo(String value) {
            addCriterion("dish_intro =", value, "dishIntro");
            return (Criteria) this;
        }

        public Criteria andDishIntroNotEqualTo(String value) {
            addCriterion("dish_intro <>", value, "dishIntro");
            return (Criteria) this;
        }

        public Criteria andDishIntroGreaterThan(String value) {
            addCriterion("dish_intro >", value, "dishIntro");
            return (Criteria) this;
        }

        public Criteria andDishIntroGreaterThanOrEqualTo(String value) {
            addCriterion("dish_intro >=", value, "dishIntro");
            return (Criteria) this;
        }

        public Criteria andDishIntroLessThan(String value) {
            addCriterion("dish_intro <", value, "dishIntro");
            return (Criteria) this;
        }

        public Criteria andDishIntroLessThanOrEqualTo(String value) {
            addCriterion("dish_intro <=", value, "dishIntro");
            return (Criteria) this;
        }

        public Criteria andDishIntroLike(String value) {
            addCriterion("dish_intro like", value, "dishIntro");
            return (Criteria) this;
        }

        public Criteria andDishIntroNotLike(String value) {
            addCriterion("dish_intro not like", value, "dishIntro");
            return (Criteria) this;
        }

        public Criteria andDishIntroIn(List<String> values) {
            addCriterion("dish_intro in", values, "dishIntro");
            return (Criteria) this;
        }

        public Criteria andDishIntroNotIn(List<String> values) {
            addCriterion("dish_intro not in", values, "dishIntro");
            return (Criteria) this;
        }

        public Criteria andDishIntroBetween(String value1, String value2) {
            addCriterion("dish_intro between", value1, value2, "dishIntro");
            return (Criteria) this;
        }

        public Criteria andDishIntroNotBetween(String value1, String value2) {
            addCriterion("dish_intro not between", value1, value2, "dishIntro");
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

        public Criteria andDishPictureIsNull() {
            addCriterion("dish_picture is null");
            return (Criteria) this;
        }

        public Criteria andDishPictureIsNotNull() {
            addCriterion("dish_picture is not null");
            return (Criteria) this;
        }

        public Criteria andDishPictureEqualTo(String value) {
            addCriterion("dish_picture =", value, "dishPicture");
            return (Criteria) this;
        }

        public Criteria andDishPictureNotEqualTo(String value) {
            addCriterion("dish_picture <>", value, "dishPicture");
            return (Criteria) this;
        }

        public Criteria andDishPictureGreaterThan(String value) {
            addCriterion("dish_picture >", value, "dishPicture");
            return (Criteria) this;
        }

        public Criteria andDishPictureGreaterThanOrEqualTo(String value) {
            addCriterion("dish_picture >=", value, "dishPicture");
            return (Criteria) this;
        }

        public Criteria andDishPictureLessThan(String value) {
            addCriterion("dish_picture <", value, "dishPicture");
            return (Criteria) this;
        }

        public Criteria andDishPictureLessThanOrEqualTo(String value) {
            addCriterion("dish_picture <=", value, "dishPicture");
            return (Criteria) this;
        }

        public Criteria andDishPictureLike(String value) {
            addCriterion("dish_picture like", value, "dishPicture");
            return (Criteria) this;
        }

        public Criteria andDishPictureNotLike(String value) {
            addCriterion("dish_picture not like", value, "dishPicture");
            return (Criteria) this;
        }

        public Criteria andDishPictureIn(List<String> values) {
            addCriterion("dish_picture in", values, "dishPicture");
            return (Criteria) this;
        }

        public Criteria andDishPictureNotIn(List<String> values) {
            addCriterion("dish_picture not in", values, "dishPicture");
            return (Criteria) this;
        }

        public Criteria andDishPictureBetween(String value1, String value2) {
            addCriterion("dish_picture between", value1, value2, "dishPicture");
            return (Criteria) this;
        }

        public Criteria andDishPictureNotBetween(String value1, String value2) {
            addCriterion("dish_picture not between", value1, value2, "dishPicture");
            return (Criteria) this;
        }

        public Criteria andDishEvaluateIsNull() {
            addCriterion("dish_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andDishEvaluateIsNotNull() {
            addCriterion("dish_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andDishEvaluateEqualTo(String value) {
            addCriterion("dish_evaluate =", value, "dishEvaluate");
            return (Criteria) this;
        }

        public Criteria andDishEvaluateNotEqualTo(String value) {
            addCriterion("dish_evaluate <>", value, "dishEvaluate");
            return (Criteria) this;
        }

        public Criteria andDishEvaluateGreaterThan(String value) {
            addCriterion("dish_evaluate >", value, "dishEvaluate");
            return (Criteria) this;
        }

        public Criteria andDishEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("dish_evaluate >=", value, "dishEvaluate");
            return (Criteria) this;
        }

        public Criteria andDishEvaluateLessThan(String value) {
            addCriterion("dish_evaluate <", value, "dishEvaluate");
            return (Criteria) this;
        }

        public Criteria andDishEvaluateLessThanOrEqualTo(String value) {
            addCriterion("dish_evaluate <=", value, "dishEvaluate");
            return (Criteria) this;
        }

        public Criteria andDishEvaluateLike(String value) {
            addCriterion("dish_evaluate like", value, "dishEvaluate");
            return (Criteria) this;
        }

        public Criteria andDishEvaluateNotLike(String value) {
            addCriterion("dish_evaluate not like", value, "dishEvaluate");
            return (Criteria) this;
        }

        public Criteria andDishEvaluateIn(List<String> values) {
            addCriterion("dish_evaluate in", values, "dishEvaluate");
            return (Criteria) this;
        }

        public Criteria andDishEvaluateNotIn(List<String> values) {
            addCriterion("dish_evaluate not in", values, "dishEvaluate");
            return (Criteria) this;
        }

        public Criteria andDishEvaluateBetween(String value1, String value2) {
            addCriterion("dish_evaluate between", value1, value2, "dishEvaluate");
            return (Criteria) this;
        }

        public Criteria andDishEvaluateNotBetween(String value1, String value2) {
            addCriterion("dish_evaluate not between", value1, value2, "dishEvaluate");
            return (Criteria) this;
        }

        public Criteria andThumbAccountIsNull() {
            addCriterion("thumb_account is null");
            return (Criteria) this;
        }

        public Criteria andThumbAccountIsNotNull() {
            addCriterion("thumb_account is not null");
            return (Criteria) this;
        }

        public Criteria andThumbAccountEqualTo(Integer value) {
            addCriterion("thumb_account =", value, "thumbAccount");
            return (Criteria) this;
        }

        public Criteria andThumbAccountNotEqualTo(Integer value) {
            addCriterion("thumb_account <>", value, "thumbAccount");
            return (Criteria) this;
        }

        public Criteria andThumbAccountGreaterThan(Integer value) {
            addCriterion("thumb_account >", value, "thumbAccount");
            return (Criteria) this;
        }

        public Criteria andThumbAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("thumb_account >=", value, "thumbAccount");
            return (Criteria) this;
        }

        public Criteria andThumbAccountLessThan(Integer value) {
            addCriterion("thumb_account <", value, "thumbAccount");
            return (Criteria) this;
        }

        public Criteria andThumbAccountLessThanOrEqualTo(Integer value) {
            addCriterion("thumb_account <=", value, "thumbAccount");
            return (Criteria) this;
        }

        public Criteria andThumbAccountIn(List<Integer> values) {
            addCriterion("thumb_account in", values, "thumbAccount");
            return (Criteria) this;
        }

        public Criteria andThumbAccountNotIn(List<Integer> values) {
            addCriterion("thumb_account not in", values, "thumbAccount");
            return (Criteria) this;
        }

        public Criteria andThumbAccountBetween(Integer value1, Integer value2) {
            addCriterion("thumb_account between", value1, value2, "thumbAccount");
            return (Criteria) this;
        }

        public Criteria andThumbAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("thumb_account not between", value1, value2, "thumbAccount");
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
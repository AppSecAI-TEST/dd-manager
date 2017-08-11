package com.atguigu.dd.manager.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TDishGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDishGroupExample() {
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
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

        public Criteria andGroupIntroIsNull() {
            addCriterion("group_intro is null");
            return (Criteria) this;
        }

        public Criteria andGroupIntroIsNotNull() {
            addCriterion("group_intro is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIntroEqualTo(String value) {
            addCriterion("group_intro =", value, "groupIntro");
            return (Criteria) this;
        }

        public Criteria andGroupIntroNotEqualTo(String value) {
            addCriterion("group_intro <>", value, "groupIntro");
            return (Criteria) this;
        }

        public Criteria andGroupIntroGreaterThan(String value) {
            addCriterion("group_intro >", value, "groupIntro");
            return (Criteria) this;
        }

        public Criteria andGroupIntroGreaterThanOrEqualTo(String value) {
            addCriterion("group_intro >=", value, "groupIntro");
            return (Criteria) this;
        }

        public Criteria andGroupIntroLessThan(String value) {
            addCriterion("group_intro <", value, "groupIntro");
            return (Criteria) this;
        }

        public Criteria andGroupIntroLessThanOrEqualTo(String value) {
            addCriterion("group_intro <=", value, "groupIntro");
            return (Criteria) this;
        }

        public Criteria andGroupIntroLike(String value) {
            addCriterion("group_intro like", value, "groupIntro");
            return (Criteria) this;
        }

        public Criteria andGroupIntroNotLike(String value) {
            addCriterion("group_intro not like", value, "groupIntro");
            return (Criteria) this;
        }

        public Criteria andGroupIntroIn(List<String> values) {
            addCriterion("group_intro in", values, "groupIntro");
            return (Criteria) this;
        }

        public Criteria andGroupIntroNotIn(List<String> values) {
            addCriterion("group_intro not in", values, "groupIntro");
            return (Criteria) this;
        }

        public Criteria andGroupIntroBetween(String value1, String value2) {
            addCriterion("group_intro between", value1, value2, "groupIntro");
            return (Criteria) this;
        }

        public Criteria andGroupIntroNotBetween(String value1, String value2) {
            addCriterion("group_intro not between", value1, value2, "groupIntro");
            return (Criteria) this;
        }

        public Criteria andGroupPriceIsNull() {
            addCriterion("group_price is null");
            return (Criteria) this;
        }

        public Criteria andGroupPriceIsNotNull() {
            addCriterion("group_price is not null");
            return (Criteria) this;
        }

        public Criteria andGroupPriceEqualTo(BigDecimal value) {
            addCriterion("group_price =", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceNotEqualTo(BigDecimal value) {
            addCriterion("group_price <>", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceGreaterThan(BigDecimal value) {
            addCriterion("group_price >", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("group_price >=", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceLessThan(BigDecimal value) {
            addCriterion("group_price <", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("group_price <=", value, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceIn(List<BigDecimal> values) {
            addCriterion("group_price in", values, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceNotIn(List<BigDecimal> values) {
            addCriterion("group_price not in", values, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_price between", value1, value2, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_price not between", value1, value2, "groupPrice");
            return (Criteria) this;
        }

        public Criteria andGroupPictureIsNull() {
            addCriterion("group_picture is null");
            return (Criteria) this;
        }

        public Criteria andGroupPictureIsNotNull() {
            addCriterion("group_picture is not null");
            return (Criteria) this;
        }

        public Criteria andGroupPictureEqualTo(String value) {
            addCriterion("group_picture =", value, "groupPicture");
            return (Criteria) this;
        }

        public Criteria andGroupPictureNotEqualTo(String value) {
            addCriterion("group_picture <>", value, "groupPicture");
            return (Criteria) this;
        }

        public Criteria andGroupPictureGreaterThan(String value) {
            addCriterion("group_picture >", value, "groupPicture");
            return (Criteria) this;
        }

        public Criteria andGroupPictureGreaterThanOrEqualTo(String value) {
            addCriterion("group_picture >=", value, "groupPicture");
            return (Criteria) this;
        }

        public Criteria andGroupPictureLessThan(String value) {
            addCriterion("group_picture <", value, "groupPicture");
            return (Criteria) this;
        }

        public Criteria andGroupPictureLessThanOrEqualTo(String value) {
            addCriterion("group_picture <=", value, "groupPicture");
            return (Criteria) this;
        }

        public Criteria andGroupPictureLike(String value) {
            addCriterion("group_picture like", value, "groupPicture");
            return (Criteria) this;
        }

        public Criteria andGroupPictureNotLike(String value) {
            addCriterion("group_picture not like", value, "groupPicture");
            return (Criteria) this;
        }

        public Criteria andGroupPictureIn(List<String> values) {
            addCriterion("group_picture in", values, "groupPicture");
            return (Criteria) this;
        }

        public Criteria andGroupPictureNotIn(List<String> values) {
            addCriterion("group_picture not in", values, "groupPicture");
            return (Criteria) this;
        }

        public Criteria andGroupPictureBetween(String value1, String value2) {
            addCriterion("group_picture between", value1, value2, "groupPicture");
            return (Criteria) this;
        }

        public Criteria andGroupPictureNotBetween(String value1, String value2) {
            addCriterion("group_picture not between", value1, value2, "groupPicture");
            return (Criteria) this;
        }

        public Criteria andGroupEvaluateIsNull() {
            addCriterion("group_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andGroupEvaluateIsNotNull() {
            addCriterion("group_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andGroupEvaluateEqualTo(String value) {
            addCriterion("group_evaluate =", value, "groupEvaluate");
            return (Criteria) this;
        }

        public Criteria andGroupEvaluateNotEqualTo(String value) {
            addCriterion("group_evaluate <>", value, "groupEvaluate");
            return (Criteria) this;
        }

        public Criteria andGroupEvaluateGreaterThan(String value) {
            addCriterion("group_evaluate >", value, "groupEvaluate");
            return (Criteria) this;
        }

        public Criteria andGroupEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("group_evaluate >=", value, "groupEvaluate");
            return (Criteria) this;
        }

        public Criteria andGroupEvaluateLessThan(String value) {
            addCriterion("group_evaluate <", value, "groupEvaluate");
            return (Criteria) this;
        }

        public Criteria andGroupEvaluateLessThanOrEqualTo(String value) {
            addCriterion("group_evaluate <=", value, "groupEvaluate");
            return (Criteria) this;
        }

        public Criteria andGroupEvaluateLike(String value) {
            addCriterion("group_evaluate like", value, "groupEvaluate");
            return (Criteria) this;
        }

        public Criteria andGroupEvaluateNotLike(String value) {
            addCriterion("group_evaluate not like", value, "groupEvaluate");
            return (Criteria) this;
        }

        public Criteria andGroupEvaluateIn(List<String> values) {
            addCriterion("group_evaluate in", values, "groupEvaluate");
            return (Criteria) this;
        }

        public Criteria andGroupEvaluateNotIn(List<String> values) {
            addCriterion("group_evaluate not in", values, "groupEvaluate");
            return (Criteria) this;
        }

        public Criteria andGroupEvaluateBetween(String value1, String value2) {
            addCriterion("group_evaluate between", value1, value2, "groupEvaluate");
            return (Criteria) this;
        }

        public Criteria andGroupEvaluateNotBetween(String value1, String value2) {
            addCriterion("group_evaluate not between", value1, value2, "groupEvaluate");
            return (Criteria) this;
        }

        public Criteria andPersonTatalIsNull() {
            addCriterion("person_tatal is null");
            return (Criteria) this;
        }

        public Criteria andPersonTatalIsNotNull() {
            addCriterion("person_tatal is not null");
            return (Criteria) this;
        }

        public Criteria andPersonTatalEqualTo(Integer value) {
            addCriterion("person_tatal =", value, "personTatal");
            return (Criteria) this;
        }

        public Criteria andPersonTatalNotEqualTo(Integer value) {
            addCriterion("person_tatal <>", value, "personTatal");
            return (Criteria) this;
        }

        public Criteria andPersonTatalGreaterThan(Integer value) {
            addCriterion("person_tatal >", value, "personTatal");
            return (Criteria) this;
        }

        public Criteria andPersonTatalGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_tatal >=", value, "personTatal");
            return (Criteria) this;
        }

        public Criteria andPersonTatalLessThan(Integer value) {
            addCriterion("person_tatal <", value, "personTatal");
            return (Criteria) this;
        }

        public Criteria andPersonTatalLessThanOrEqualTo(Integer value) {
            addCriterion("person_tatal <=", value, "personTatal");
            return (Criteria) this;
        }

        public Criteria andPersonTatalIn(List<Integer> values) {
            addCriterion("person_tatal in", values, "personTatal");
            return (Criteria) this;
        }

        public Criteria andPersonTatalNotIn(List<Integer> values) {
            addCriterion("person_tatal not in", values, "personTatal");
            return (Criteria) this;
        }

        public Criteria andPersonTatalBetween(Integer value1, Integer value2) {
            addCriterion("person_tatal between", value1, value2, "personTatal");
            return (Criteria) this;
        }

        public Criteria andPersonTatalNotBetween(Integer value1, Integer value2) {
            addCriterion("person_tatal not between", value1, value2, "personTatal");
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
package com.atguigu.dd.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class TShopkeeperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TShopkeeperExample() {
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

        public Criteria andShopkeeperIdIsNull() {
            addCriterion("shopkeeper_id is null");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIdIsNotNull() {
            addCriterion("shopkeeper_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIdEqualTo(String value) {
            addCriterion("shopkeeper_id =", value, "shopkeeperId");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIdNotEqualTo(String value) {
            addCriterion("shopkeeper_id <>", value, "shopkeeperId");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIdGreaterThan(String value) {
            addCriterion("shopkeeper_id >", value, "shopkeeperId");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIdGreaterThanOrEqualTo(String value) {
            addCriterion("shopkeeper_id >=", value, "shopkeeperId");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIdLessThan(String value) {
            addCriterion("shopkeeper_id <", value, "shopkeeperId");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIdLessThanOrEqualTo(String value) {
            addCriterion("shopkeeper_id <=", value, "shopkeeperId");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIdLike(String value) {
            addCriterion("shopkeeper_id like", value, "shopkeeperId");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIdNotLike(String value) {
            addCriterion("shopkeeper_id not like", value, "shopkeeperId");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIdIn(List<String> values) {
            addCriterion("shopkeeper_id in", values, "shopkeeperId");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIdNotIn(List<String> values) {
            addCriterion("shopkeeper_id not in", values, "shopkeeperId");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIdBetween(String value1, String value2) {
            addCriterion("shopkeeper_id between", value1, value2, "shopkeeperId");
            return (Criteria) this;
        }

        public Criteria andShopkeeperIdNotBetween(String value1, String value2) {
            addCriterion("shopkeeper_id not between", value1, value2, "shopkeeperId");
            return (Criteria) this;
        }

        public Criteria andCorporationCardidIsNull() {
            addCriterion("corporation_cardid is null");
            return (Criteria) this;
        }

        public Criteria andCorporationCardidIsNotNull() {
            addCriterion("corporation_cardid is not null");
            return (Criteria) this;
        }

        public Criteria andCorporationCardidEqualTo(String value) {
            addCriterion("corporation_cardid =", value, "corporationCardid");
            return (Criteria) this;
        }

        public Criteria andCorporationCardidNotEqualTo(String value) {
            addCriterion("corporation_cardid <>", value, "corporationCardid");
            return (Criteria) this;
        }

        public Criteria andCorporationCardidGreaterThan(String value) {
            addCriterion("corporation_cardid >", value, "corporationCardid");
            return (Criteria) this;
        }

        public Criteria andCorporationCardidGreaterThanOrEqualTo(String value) {
            addCriterion("corporation_cardid >=", value, "corporationCardid");
            return (Criteria) this;
        }

        public Criteria andCorporationCardidLessThan(String value) {
            addCriterion("corporation_cardid <", value, "corporationCardid");
            return (Criteria) this;
        }

        public Criteria andCorporationCardidLessThanOrEqualTo(String value) {
            addCriterion("corporation_cardid <=", value, "corporationCardid");
            return (Criteria) this;
        }

        public Criteria andCorporationCardidLike(String value) {
            addCriterion("corporation_cardid like", value, "corporationCardid");
            return (Criteria) this;
        }

        public Criteria andCorporationCardidNotLike(String value) {
            addCriterion("corporation_cardid not like", value, "corporationCardid");
            return (Criteria) this;
        }

        public Criteria andCorporationCardidIn(List<String> values) {
            addCriterion("corporation_cardid in", values, "corporationCardid");
            return (Criteria) this;
        }

        public Criteria andCorporationCardidNotIn(List<String> values) {
            addCriterion("corporation_cardid not in", values, "corporationCardid");
            return (Criteria) this;
        }

        public Criteria andCorporationCardidBetween(String value1, String value2) {
            addCriterion("corporation_cardid between", value1, value2, "corporationCardid");
            return (Criteria) this;
        }

        public Criteria andCorporationCardidNotBetween(String value1, String value2) {
            addCriterion("corporation_cardid not between", value1, value2, "corporationCardid");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameIsNull() {
            addCriterion("shopkeeper_name is null");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameIsNotNull() {
            addCriterion("shopkeeper_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameEqualTo(String value) {
            addCriterion("shopkeeper_name =", value, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameNotEqualTo(String value) {
            addCriterion("shopkeeper_name <>", value, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameGreaterThan(String value) {
            addCriterion("shopkeeper_name >", value, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameGreaterThanOrEqualTo(String value) {
            addCriterion("shopkeeper_name >=", value, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameLessThan(String value) {
            addCriterion("shopkeeper_name <", value, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameLessThanOrEqualTo(String value) {
            addCriterion("shopkeeper_name <=", value, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameLike(String value) {
            addCriterion("shopkeeper_name like", value, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameNotLike(String value) {
            addCriterion("shopkeeper_name not like", value, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameIn(List<String> values) {
            addCriterion("shopkeeper_name in", values, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameNotIn(List<String> values) {
            addCriterion("shopkeeper_name not in", values, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameBetween(String value1, String value2) {
            addCriterion("shopkeeper_name between", value1, value2, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperNameNotBetween(String value1, String value2) {
            addCriterion("shopkeeper_name not between", value1, value2, "shopkeeperName");
            return (Criteria) this;
        }

        public Criteria andShopkeeperPhoneIsNull() {
            addCriterion("shopkeeper_phone is null");
            return (Criteria) this;
        }

        public Criteria andShopkeeperPhoneIsNotNull() {
            addCriterion("shopkeeper_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShopkeeperPhoneEqualTo(String value) {
            addCriterion("shopkeeper_phone =", value, "shopkeeperPhone");
            return (Criteria) this;
        }

        public Criteria andShopkeeperPhoneNotEqualTo(String value) {
            addCriterion("shopkeeper_phone <>", value, "shopkeeperPhone");
            return (Criteria) this;
        }

        public Criteria andShopkeeperPhoneGreaterThan(String value) {
            addCriterion("shopkeeper_phone >", value, "shopkeeperPhone");
            return (Criteria) this;
        }

        public Criteria andShopkeeperPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("shopkeeper_phone >=", value, "shopkeeperPhone");
            return (Criteria) this;
        }

        public Criteria andShopkeeperPhoneLessThan(String value) {
            addCriterion("shopkeeper_phone <", value, "shopkeeperPhone");
            return (Criteria) this;
        }

        public Criteria andShopkeeperPhoneLessThanOrEqualTo(String value) {
            addCriterion("shopkeeper_phone <=", value, "shopkeeperPhone");
            return (Criteria) this;
        }

        public Criteria andShopkeeperPhoneLike(String value) {
            addCriterion("shopkeeper_phone like", value, "shopkeeperPhone");
            return (Criteria) this;
        }

        public Criteria andShopkeeperPhoneNotLike(String value) {
            addCriterion("shopkeeper_phone not like", value, "shopkeeperPhone");
            return (Criteria) this;
        }

        public Criteria andShopkeeperPhoneIn(List<String> values) {
            addCriterion("shopkeeper_phone in", values, "shopkeeperPhone");
            return (Criteria) this;
        }

        public Criteria andShopkeeperPhoneNotIn(List<String> values) {
            addCriterion("shopkeeper_phone not in", values, "shopkeeperPhone");
            return (Criteria) this;
        }

        public Criteria andShopkeeperPhoneBetween(String value1, String value2) {
            addCriterion("shopkeeper_phone between", value1, value2, "shopkeeperPhone");
            return (Criteria) this;
        }

        public Criteria andShopkeeperPhoneNotBetween(String value1, String value2) {
            addCriterion("shopkeeper_phone not between", value1, value2, "shopkeeperPhone");
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
package com.atguigu.dd.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TAvertisementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAvertisementExample() {
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

        public Criteria andAdIdIsNull() {
            addCriterion("ad_id is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("ad_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(Integer value) {
            addCriterion("ad_id =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(Integer value) {
            addCriterion("ad_id <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(Integer value) {
            addCriterion("ad_id >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_id >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(Integer value) {
            addCriterion("ad_id <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(Integer value) {
            addCriterion("ad_id <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<Integer> values) {
            addCriterion("ad_id in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<Integer> values) {
            addCriterion("ad_id not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(Integer value1, Integer value2) {
            addCriterion("ad_id between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_id not between", value1, value2, "adId");
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

        public Criteria andAdInfoIsNull() {
            addCriterion("ad_info is null");
            return (Criteria) this;
        }

        public Criteria andAdInfoIsNotNull() {
            addCriterion("ad_info is not null");
            return (Criteria) this;
        }

        public Criteria andAdInfoEqualTo(String value) {
            addCriterion("ad_info =", value, "adInfo");
            return (Criteria) this;
        }

        public Criteria andAdInfoNotEqualTo(String value) {
            addCriterion("ad_info <>", value, "adInfo");
            return (Criteria) this;
        }

        public Criteria andAdInfoGreaterThan(String value) {
            addCriterion("ad_info >", value, "adInfo");
            return (Criteria) this;
        }

        public Criteria andAdInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ad_info >=", value, "adInfo");
            return (Criteria) this;
        }

        public Criteria andAdInfoLessThan(String value) {
            addCriterion("ad_info <", value, "adInfo");
            return (Criteria) this;
        }

        public Criteria andAdInfoLessThanOrEqualTo(String value) {
            addCriterion("ad_info <=", value, "adInfo");
            return (Criteria) this;
        }

        public Criteria andAdInfoLike(String value) {
            addCriterion("ad_info like", value, "adInfo");
            return (Criteria) this;
        }

        public Criteria andAdInfoNotLike(String value) {
            addCriterion("ad_info not like", value, "adInfo");
            return (Criteria) this;
        }

        public Criteria andAdInfoIn(List<String> values) {
            addCriterion("ad_info in", values, "adInfo");
            return (Criteria) this;
        }

        public Criteria andAdInfoNotIn(List<String> values) {
            addCriterion("ad_info not in", values, "adInfo");
            return (Criteria) this;
        }

        public Criteria andAdInfoBetween(String value1, String value2) {
            addCriterion("ad_info between", value1, value2, "adInfo");
            return (Criteria) this;
        }

        public Criteria andAdInfoNotBetween(String value1, String value2) {
            addCriterion("ad_info not between", value1, value2, "adInfo");
            return (Criteria) this;
        }

        public Criteria andAdPictureIsNull() {
            addCriterion("ad_picture is null");
            return (Criteria) this;
        }

        public Criteria andAdPictureIsNotNull() {
            addCriterion("ad_picture is not null");
            return (Criteria) this;
        }

        public Criteria andAdPictureEqualTo(String value) {
            addCriterion("ad_picture =", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureNotEqualTo(String value) {
            addCriterion("ad_picture <>", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureGreaterThan(String value) {
            addCriterion("ad_picture >", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureGreaterThanOrEqualTo(String value) {
            addCriterion("ad_picture >=", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureLessThan(String value) {
            addCriterion("ad_picture <", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureLessThanOrEqualTo(String value) {
            addCriterion("ad_picture <=", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureLike(String value) {
            addCriterion("ad_picture like", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureNotLike(String value) {
            addCriterion("ad_picture not like", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureIn(List<String> values) {
            addCriterion("ad_picture in", values, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureNotIn(List<String> values) {
            addCriterion("ad_picture not in", values, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureBetween(String value1, String value2) {
            addCriterion("ad_picture between", value1, value2, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureNotBetween(String value1, String value2) {
            addCriterion("ad_picture not between", value1, value2, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdDataIsNull() {
            addCriterion("ad_data is null");
            return (Criteria) this;
        }

        public Criteria andAdDataIsNotNull() {
            addCriterion("ad_data is not null");
            return (Criteria) this;
        }

        public Criteria andAdDataEqualTo(Date value) {
            addCriterion("ad_data =", value, "adData");
            return (Criteria) this;
        }

        public Criteria andAdDataNotEqualTo(Date value) {
            addCriterion("ad_data <>", value, "adData");
            return (Criteria) this;
        }

        public Criteria andAdDataGreaterThan(Date value) {
            addCriterion("ad_data >", value, "adData");
            return (Criteria) this;
        }

        public Criteria andAdDataGreaterThanOrEqualTo(Date value) {
            addCriterion("ad_data >=", value, "adData");
            return (Criteria) this;
        }

        public Criteria andAdDataLessThan(Date value) {
            addCriterion("ad_data <", value, "adData");
            return (Criteria) this;
        }

        public Criteria andAdDataLessThanOrEqualTo(Date value) {
            addCriterion("ad_data <=", value, "adData");
            return (Criteria) this;
        }

        public Criteria andAdDataIn(List<Date> values) {
            addCriterion("ad_data in", values, "adData");
            return (Criteria) this;
        }

        public Criteria andAdDataNotIn(List<Date> values) {
            addCriterion("ad_data not in", values, "adData");
            return (Criteria) this;
        }

        public Criteria andAdDataBetween(Date value1, Date value2) {
            addCriterion("ad_data between", value1, value2, "adData");
            return (Criteria) this;
        }

        public Criteria andAdDataNotBetween(Date value1, Date value2) {
            addCriterion("ad_data not between", value1, value2, "adData");
            return (Criteria) this;
        }

        public Criteria andAdStatusIsNull() {
            addCriterion("ad_status is null");
            return (Criteria) this;
        }

        public Criteria andAdStatusIsNotNull() {
            addCriterion("ad_status is not null");
            return (Criteria) this;
        }

        public Criteria andAdStatusEqualTo(Integer value) {
            addCriterion("ad_status =", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusNotEqualTo(Integer value) {
            addCriterion("ad_status <>", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusGreaterThan(Integer value) {
            addCriterion("ad_status >", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_status >=", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusLessThan(Integer value) {
            addCriterion("ad_status <", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ad_status <=", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusIn(List<Integer> values) {
            addCriterion("ad_status in", values, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusNotIn(List<Integer> values) {
            addCriterion("ad_status not in", values, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusBetween(Integer value1, Integer value2) {
            addCriterion("ad_status between", value1, value2, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_status not between", value1, value2, "adStatus");
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
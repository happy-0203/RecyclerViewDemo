package com.example.cc.recyclerviewdemo;

import java.util.List;

/**
 * Created by cc on 2017/11/11.
 */

public class GoodsBean {

    /**
     * content : [{"id":16755,"name":"JOYROOM D113 10000mAh Jun Series Power Bank","minPrice":145100,"maxPrice":145100,"currency":"RP","afterSalesPolicy":null,"weight":null,"volume":null,"marketPrice":435000,"oversold":false,"minBuy":1,"marketable":null,"salesAttrs":null,"goodsStepPrices":null,"image":"https://pic.21chinamall.com/5cfa8129e9844a6b929b6ad5d23c2a6c.jpg@240w","images":null,"inventory":90,"desc":null,"brand":{"id":65,"name":"JOYROOM","url":"http://","desc":"&nbsp;","logo":"https://pic.21chinamall.com/cf5ce24663d14129b33a50ec412a8ad7.png","aptitude":"","keywords":"Joyroom|机乐堂","setting":"a:1:{s:14:\"brand_template\";s:1:\"0\";}","order":0,"favCount":1},"typeId":null,"availableStock":null,"categoryLevel1":null,"categoryLevel2":null,"categoryLevel3":null,"websiteSettingDTO":null,"priceFormat":null,"marketPriceFormat":null,"spu":null,"extensionInfoList":null},{"id":16757,"name":"JOYROOM D109 6000mAh Stone Series Power Bank","minPrice":95000,"maxPrice":95000,"currency":"RP","afterSalesPolicy":null,"weight":null,"volume":null,"marketPrice":379000,"oversold":false,"minBuy":1,"marketable":null,"salesAttrs":null,"goodsStepPrices":null,"image":"https://pic.21chinamall.com/b74807a3c0f446298ada34ec24e7cce7.jpg@240w","images":null,"inventory":0,"desc":null,"brand":{"id":65,"name":"JOYROOM","url":"http://","desc":"&nbsp;","logo":"https://pic.21chinamall.com/cf5ce24663d14129b33a50ec412a8ad7.png","aptitude":"","keywords":"Joyroom|机乐堂","setting":"a:1:{s:14:\"brand_template\";s:1:\"0\";}","order":0,"favCount":1},"typeId":null,"availableStock":null,"categoryLevel1":null,"categoryLevel2":null,"categoryLevel3":null,"websiteSettingDTO":null,"priceFormat":null,"marketPriceFormat":null,"spu":null,"extensionInfoList":null},{"id":16306,"name":"FENGLONG P600 6000mAh 2 USB Ports Power Bank","minPrice":89000,"maxPrice":89000,"currency":"RP","afterSalesPolicy":null,"weight":null,"volume":null,"marketPrice":285000,"oversold":false,"minBuy":1,"marketable":null,"salesAttrs":null,"goodsStepPrices":null,"image":"https://pic.21chinamall.com/7a2b6215d8b44494a42d486bf634afe8.jpg@240w","images":null,"inventory":51,"desc":null,"brand":{"id":254,"name":"FENGLONG","url":"","desc":"&nbsp;","logo":"https://pic.21chinamall.com/f69a14573d7646a097ddcf4684d5f710.png","aptitude":"","keywords":"","setting":"a:1:{s:14:\"brand_template\";s:1:\"0\";}","order":20,"favCount":1},"typeId":null,"availableStock":null,"categoryLevel1":null,"categoryLevel2":null,"categoryLevel3":null,"websiteSettingDTO":null,"priceFormat":null,"marketPriceFormat":null,"spu":null,"extensionInfoList":null},{"id":14269,"name":"ONDA M100T 10000mAh Power Bank","minPrice":128000,"maxPrice":128000,"currency":"RP","afterSalesPolicy":null,"weight":null,"volume":null,"marketPrice":384000,"oversold":false,"minBuy":1,"marketable":null,"salesAttrs":null,"goodsStepPrices":null,"image":"https://pic.21chinamall.com/ec861351319047749e71b5dc8820ae24.jpg@240w","images":null,"inventory":44,"desc":null,"brand":{"id":163,"name":"ONDA","url":"","desc":"&nbsp;","logo":"https://pic.21chinamall.com/54c1077043c4410f8925625adda44d96.png","aptitude":"","keywords":"","setting":"a:1:{s:14:\"brand_template\";s:1:\"0\";}","order":10,"favCount":1},"typeId":null,"availableStock":null,"categoryLevel1":null,"categoryLevel2":null,"categoryLevel3":null,"websiteSettingDTO":null,"priceFormat":null,"marketPriceFormat":null,"spu":null,"extensionInfoList":null},{"id":16538,"name":"ONDA N100T PLUS 10000mAh Power Bank","minPrice":151000,"maxPrice":151000,"currency":"RP","afterSalesPolicy":null,"weight":null,"volume":null,"marketPrice":453000,"oversold":false,"minBuy":1,"marketable":null,"salesAttrs":null,"goodsStepPrices":null,"image":"https://pic.21chinamall.com/df89df5bbf264030b1b20f1b50f76181.jpg@240w","images":null,"inventory":336,"desc":null,"brand":{"id":163,"name":"ONDA","url":"","desc":"&nbsp;","logo":"https://pic.21chinamall.com/54c1077043c4410f8925625adda44d96.png","aptitude":"","keywords":"","setting":"a:1:{s:14:\"brand_template\";s:1:\"0\";}","order":10,"favCount":1},"typeId":null,"availableStock":null,"categoryLevel1":null,"categoryLevel2":null,"categoryLevel3":null,"websiteSettingDTO":null,"priceFormat":null,"marketPriceFormat":null,"spu":null,"extensionInfoList":null},{"id":16539,"name":"ONDA M100S 10000mAh Power Bank","minPrice":179000,"maxPrice":179000,"currency":"RP","afterSalesPolicy":null,"weight":null,"volume":null,"marketPrice":537000,"oversold":false,"minBuy":1,"marketable":null,"salesAttrs":null,"goodsStepPrices":null,"image":"https://pic.21chinamall.com/19658affd7e14ddca81bc3b570c976a6.jpg@240w","images":null,"inventory":316,"desc":null,"brand":{"id":163,"name":"ONDA","url":"","desc":"&nbsp;","logo":"https://pic.21chinamall.com/54c1077043c4410f8925625adda44d96.png","aptitude":"","keywords":"","setting":"a:1:{s:14:\"brand_template\";s:1:\"0\";}","order":10,"favCount":1},"typeId":null,"availableStock":null,"categoryLevel1":null,"categoryLevel2":null,"categoryLevel3":null,"websiteSettingDTO":null,"priceFormat":null,"marketPriceFormat":null,"spu":null,"extensionInfoList":null},{"id":14275,"name":"ONDA N200T 20000mAh 3 USB Ports Power Bank","minPrice":252100,"maxPrice":252100,"currency":"RP","afterSalesPolicy":null,"weight":null,"volume":null,"marketPrice":756000,"oversold":false,"minBuy":1,"marketable":null,"salesAttrs":null,"goodsStepPrices":null,"image":"https://pic.21chinamall.com/14902e8b6a7544c1bb4d89f8c2d8349e.jpg@240w","images":null,"inventory":135,"desc":null,"brand":{"id":163,"name":"ONDA","url":"","desc":"&nbsp;","logo":"https://pic.21chinamall.com/54c1077043c4410f8925625adda44d96.png","aptitude":"","keywords":"","setting":"a:1:{s:14:\"brand_template\";s:1:\"0\";}","order":10,"favCount":1},"typeId":null,"availableStock":null,"categoryLevel1":null,"categoryLevel2":null,"categoryLevel3":null,"websiteSettingDTO":null,"priceFormat":null,"marketPriceFormat":null,"spu":null,"extensionInfoList":null},{"id":16299,"name":"FENGLONG P125 12500mAh 2 USB Ports Power Bank","minPrice":129000,"maxPrice":129000,"currency":"RP","afterSalesPolicy":null,"weight":null,"volume":null,"marketPrice":402000,"oversold":false,"minBuy":1,"marketable":null,"salesAttrs":null,"goodsStepPrices":null,"image":"https://pic.21chinamall.com/bd7c379688294c48b2943087dc239cc0.jpg@240w","images":null,"inventory":0,"desc":null,"brand":{"id":254,"name":"FENGLONG","url":"","desc":"&nbsp;","logo":"https://pic.21chinamall.com/f69a14573d7646a097ddcf4684d5f710.png","aptitude":"","keywords":"","setting":"a:1:{s:14:\"brand_template\";s:1:\"0\";}","order":20,"favCount":1},"typeId":null,"availableStock":null,"categoryLevel1":null,"categoryLevel2":null,"categoryLevel3":null,"websiteSettingDTO":null,"priceFormat":null,"marketPriceFormat":null,"spu":null,"extensionInfoList":null},{"id":16770,"name":"JOYROOM JR-S118 1M 2.1A XunJie Series Lighting Data Cable for iPhone 5/ 5S/ 6/ 6S","minPrice":13000,"maxPrice":13000,"currency":"RP","afterSalesPolicy":null,"weight":null,"volume":null,"marketPrice":52000,"oversold":false,"minBuy":1,"marketable":null,"salesAttrs":null,"goodsStepPrices":null,"image":"https://pic.21chinamall.com/b21e3525264c4e3da837b7fd84e995c9.jpg@240w","images":null,"inventory":983,"desc":null,"brand":{"id":65,"name":"JOYROOM","url":"http://","desc":"&nbsp;","logo":"https://pic.21chinamall.com/cf5ce24663d14129b33a50ec412a8ad7.png","aptitude":"","keywords":"Joyroom|机乐堂","setting":"a:1:{s:14:\"brand_template\";s:1:\"0\";}","order":0,"favCount":1},"typeId":null,"availableStock":null,"categoryLevel1":null,"categoryLevel2":null,"categoryLevel3":null,"websiteSettingDTO":null,"priceFormat":null,"marketPriceFormat":null,"spu":null,"extensionInfoList":null},{"id":16779,"name":"JOYROOM JR-S116 1M 2.1A QingChun Series Micro USB Data Cable for Android","minPrice":14200,"maxPrice":14200,"currency":"RP","afterSalesPolicy":null,"weight":null,"volume":null,"marketPrice":57000,"oversold":false,"minBuy":1,"marketable":null,"salesAttrs":null,"goodsStepPrices":null,"image":"https://pic.21chinamall.com/18a8c5cb137649268ee24f2e06cda3fa.jpg@240w","images":null,"inventory":301,"desc":null,"brand":{"id":65,"name":"JOYROOM","url":"http://","desc":"&nbsp;","logo":"https://pic.21chinamall.com/cf5ce24663d14129b33a50ec412a8ad7.png","aptitude":"","keywords":"Joyroom|机乐堂","setting":"a:1:{s:14:\"brand_template\";s:1:\"0\";}","order":0,"favCount":1},"typeId":null,"availableStock":null,"categoryLevel1":null,"categoryLevel2":null,"categoryLevel3":null,"websiteSettingDTO":null,"priceFormat":null,"marketPriceFormat":null,"spu":null,"extensionInfoList":null},{"id":12985,"name":"JOYROOM JR-S116 1M 2.1A Youth Series Lighting Data Cable for iPhone 5/ 5S/ 6/ 6S","minPrice":18400,"maxPrice":18400,"currency":"RP","afterSalesPolicy":null,"weight":null,"volume":null,"marketPrice":74000,"oversold":false,"minBuy":1,"marketable":null,"salesAttrs":null,"goodsStepPrices":null,"image":"https://pic.21chinamall.com/27ee4dc036bc4f73914355f34c9f5587.jpg@240w","images":null,"inventory":847,"desc":null,"brand":{"id":65,"name":"JOYROOM","url":"http://","desc":"&nbsp;","logo":"https://pic.21chinamall.com/cf5ce24663d14129b33a50ec412a8ad7.png","aptitude":"","keywords":"Joyroom|机乐堂","setting":"a:1:{s:14:\"brand_template\";s:1:\"0\";}","order":0,"favCount":1},"typeId":null,"availableStock":null,"categoryLevel1":null,"categoryLevel2":null,"categoryLevel3":null,"websiteSettingDTO":null,"priceFormat":null,"marketPriceFormat":null,"spu":null,"extensionInfoList":null},{"id":16784,"name":"JOYROOM JR-S114 1M 2.1A Type-C Data Cable for Android","minPrice":30000,"maxPrice":30000,"currency":"RP","afterSalesPolicy":null,"weight":null,"volume":null,"marketPrice":120000,"oversold":false,"minBuy":1,"marketable":null,"salesAttrs":null,"goodsStepPrices":null,"image":"https://pic.21chinamall.com/1afb9fdc626e4c279b0f87ad53c40a63.jpg@240w","images":null,"inventory":61,"desc":null,"brand":{"id":65,"name":"JOYROOM","url":"http://","desc":"&nbsp;","logo":"https://pic.21chinamall.com/cf5ce24663d14129b33a50ec412a8ad7.png","aptitude":"","keywords":"Joyroom|机乐堂","setting":"a:1:{s:14:\"brand_template\";s:1:\"0\";}","order":0,"favCount":1},"typeId":null,"availableStock":null,"categoryLevel1":null,"categoryLevel2":null,"categoryLevel3":null,"websiteSettingDTO":null,"priceFormat":null,"marketPriceFormat":null,"spu":null,"extensionInfoList":null},{"id":7265,"name":"JOYROOM JR-S311 Vampires Series 2 in1 Micro USB Lightning Data Cable","minPrice":48000,"maxPrice":48000,"currency":"RP","afterSalesPolicy":null,"weight":null,"volume":null,"marketPrice":144000,"oversold":false,"minBuy":1,"marketable":null,"salesAttrs":null,"goodsStepPrices":null,"image":"https://pic.21chinamall.com/9a5b22a004be4c8ca06984ae78d16e0a.jpg@240w","images":null,"inventory":143,"desc":null,"brand":{"id":65,"name":"JOYROOM","url":"http://","desc":"&nbsp;","logo":"https://pic.21chinamall.com/cf5ce24663d14129b33a50ec412a8ad7.png","aptitude":"","keywords":"Joyroom|机乐堂","setting":"a:1:{s:14:\"brand_template\";s:1:\"0\";}","order":0,"favCount":1},"typeId":null,"availableStock":null,"categoryLevel1":null,"categoryLevel2":null,"categoryLevel3":null,"websiteSettingDTO":null,"priceFormat":null,"marketPriceFormat":null,"spu":null,"extensionInfoList":null},{"id":12988,"name":"JOYROOM S320 1.28M 3.2A Braid 3 in 1 Micro USB Lightning TYPE-C Data Cable","minPrice":55600,"maxPrice":55600,"currency":"RP","afterSalesPolicy":null,"weight":null,"volume":null,"marketPrice":222000,"oversold":false,"minBuy":1,"marketable":null,"salesAttrs":null,"goodsStepPrices":null,"image":"https://pic.21chinamall.com/f37eb0624c3c473b8412a97ad51328c2.jpg@240w","images":null,"inventory":3,"desc":null,"brand":{"id":65,"name":"JOYROOM","url":"http://","desc":"&nbsp;","logo":"https://pic.21chinamall.com/cf5ce24663d14129b33a50ec412a8ad7.png","aptitude":"","keywords":"Joyroom|机乐堂","setting":"a:1:{s:14:\"brand_template\";s:1:\"0\";}","order":0,"favCount":1},"typeId":null,"availableStock":null,"categoryLevel1":null,"categoryLevel2":null,"categoryLevel3":null,"websiteSettingDTO":null,"priceFormat":null,"marketPriceFormat":null,"spu":null,"extensionInfoList":null},{"id":15990,"name":"JOWAY JP81 5000mAh Power Bank","minPrice":90000,"maxPrice":90000,"currency":"RP","afterSalesPolicy":null,"weight":null,"volume":null,"marketPrice":405000,"oversold":false,"minBuy":1,"marketable":null,"salesAttrs":null,"goodsStepPrices":null,"image":"https://pic.21chinamall.com/29a88d3364d64e23b425b71b5ca1be2b.jpg@240w","images":null,"inventory":1,"desc":null,"brand":{"id":241,"name":"JOWAY","url":"","desc":"&nbsp;","logo":"https://pic.21chinamall.com/bf556b017e4142ce9e131f8e0b153370.png","aptitude":"","keywords":"","setting":"a:1:{s:14:\"brand_template\";s:1:\"0\";}","order":0,"favCount":1},"typeId":null,"availableStock":null,"categoryLevel1":null,"categoryLevel2":null,"categoryLevel3":null,"websiteSettingDTO":null,"priceFormat":null,"marketPriceFormat":null,"spu":null,"extensionInfoList":null},{"id":7157,"name":"ROCK RMP0302 5000mAh Stone Power Bank","minPrice":90000,"maxPrice":90000,"currency":"RP","afterSalesPolicy":null,"weight":null,"volume":null,"marketPrice":507000,"oversold":false,"minBuy":1,"marketable":null,"salesAttrs":null,"goodsStepPrices":null,"image":"https://pic.21chinamall.com/4e9cb17a33a24f65a1b5ba86a72cab11.jpg@240w","images":null,"inventory":27,"desc":null,"brand":{"id":63,"name":"ROCK","url":"http://","desc":"&nbsp;","logo":"https://pic.21chinamall.com/9f334c63d5f34358a485e1abfe2d9080.jpg","aptitude":"","keywords":"","setting":"a:1:{s:14:\"brand_template\";s:1:\"0\";}","order":0,"favCount":1},"typeId":null,"availableStock":null,"categoryLevel1":null,"categoryLevel2":null,"categoryLevel3":null,"websiteSettingDTO":null,"priceFormat":null,"marketPriceFormat":null,"spu":null,"extensionInfoList":null}]
     * totalElements : 315
     * totalPages : 20
     * last : false
     * number : 0
     * first : true
     * numberOfElements : 16
     * size : 16
     * sort : [{"direction":"ASC","property":"price","ignoreCase":false,"nullHandling":"NATIVE","ascending":true}]
     */

    private int totalElements;
    private int totalPages;
    private boolean last;
    private int number;
    private boolean first;
    private int numberOfElements;
    private int size;
    private List<ContentBean> content;
    private List<SortBean> sort;

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<ContentBean> getContent() {
        return content;
    }

    public void setContent(List<ContentBean> content) {
        this.content = content;
    }

    public List<SortBean> getSort() {
        return sort;
    }

    public void setSort(List<SortBean> sort) {
        this.sort = sort;
    }

    public static class ContentBean {
        /**
         * id : 16755
         * name : JOYROOM D113 10000mAh Jun Series Power Bank
         * minPrice : 145100.0
         * maxPrice : 145100.0
         * currency : RP
         * afterSalesPolicy : null
         * weight : null
         * volume : null
         * marketPrice : 435000.0
         * oversold : false
         * minBuy : 1
         * marketable : null
         * salesAttrs : null
         * goodsStepPrices : null
         * image : https://pic.21chinamall.com/5cfa8129e9844a6b929b6ad5d23c2a6c.jpg@240w
         * images : null
         * inventory : 90
         * desc : null
         * brand : {"id":65,"name":"JOYROOM","url":"http://","desc":"&nbsp;","logo":"https://pic.21chinamall.com/cf5ce24663d14129b33a50ec412a8ad7.png","aptitude":"","keywords":"Joyroom|机乐堂","setting":"a:1:{s:14:\"brand_template\";s:1:\"0\";}","order":0,"favCount":1}
         * typeId : null
         * availableStock : null
         * categoryLevel1 : null
         * categoryLevel2 : null
         * categoryLevel3 : null
         * websiteSettingDTO : null
         * priceFormat : null
         * marketPriceFormat : null
         * spu : null
         * extensionInfoList : null
         */

        private int id;
        private String name;
        private double minPrice;
        private double maxPrice;
        private String currency;
        private Object afterSalesPolicy;
        private Object weight;
        private Object volume;
        private double marketPrice;
        private boolean oversold;
        private int minBuy;
        private Object marketable;
        private Object salesAttrs;
        private Object goodsStepPrices;
        private String image;
        private Object images;
        private int inventory;
        private Object desc;
        private BrandBean brand;
        private Object typeId;
        private Object availableStock;
        private Object categoryLevel1;
        private Object categoryLevel2;
        private Object categoryLevel3;
        private Object websiteSettingDTO;
        private Object priceFormat;
        private Object marketPriceFormat;
        private Object spu;
        private Object extensionInfoList;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getMinPrice() {
            return minPrice;
        }

        public void setMinPrice(double minPrice) {
            this.minPrice = minPrice;
        }

        public double getMaxPrice() {
            return maxPrice;
        }

        public void setMaxPrice(double maxPrice) {
            this.maxPrice = maxPrice;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public Object getAfterSalesPolicy() {
            return afterSalesPolicy;
        }

        public void setAfterSalesPolicy(Object afterSalesPolicy) {
            this.afterSalesPolicy = afterSalesPolicy;
        }

        public Object getWeight() {
            return weight;
        }

        public void setWeight(Object weight) {
            this.weight = weight;
        }

        public Object getVolume() {
            return volume;
        }

        public void setVolume(Object volume) {
            this.volume = volume;
        }

        public double getMarketPrice() {
            return marketPrice;
        }

        public void setMarketPrice(double marketPrice) {
            this.marketPrice = marketPrice;
        }

        public boolean isOversold() {
            return oversold;
        }

        public void setOversold(boolean oversold) {
            this.oversold = oversold;
        }

        public int getMinBuy() {
            return minBuy;
        }

        public void setMinBuy(int minBuy) {
            this.minBuy = minBuy;
        }

        public Object getMarketable() {
            return marketable;
        }

        public void setMarketable(Object marketable) {
            this.marketable = marketable;
        }

        public Object getSalesAttrs() {
            return salesAttrs;
        }

        public void setSalesAttrs(Object salesAttrs) {
            this.salesAttrs = salesAttrs;
        }

        public Object getGoodsStepPrices() {
            return goodsStepPrices;
        }

        public void setGoodsStepPrices(Object goodsStepPrices) {
            this.goodsStepPrices = goodsStepPrices;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public Object getImages() {
            return images;
        }

        public void setImages(Object images) {
            this.images = images;
        }

        public int getInventory() {
            return inventory;
        }

        public void setInventory(int inventory) {
            this.inventory = inventory;
        }

        public Object getDesc() {
            return desc;
        }

        public void setDesc(Object desc) {
            this.desc = desc;
        }

        public BrandBean getBrand() {
            return brand;
        }

        public void setBrand(BrandBean brand) {
            this.brand = brand;
        }

        public Object getTypeId() {
            return typeId;
        }

        public void setTypeId(Object typeId) {
            this.typeId = typeId;
        }

        public Object getAvailableStock() {
            return availableStock;
        }

        public void setAvailableStock(Object availableStock) {
            this.availableStock = availableStock;
        }

        public Object getCategoryLevel1() {
            return categoryLevel1;
        }

        public void setCategoryLevel1(Object categoryLevel1) {
            this.categoryLevel1 = categoryLevel1;
        }

        public Object getCategoryLevel2() {
            return categoryLevel2;
        }

        public void setCategoryLevel2(Object categoryLevel2) {
            this.categoryLevel2 = categoryLevel2;
        }

        public Object getCategoryLevel3() {
            return categoryLevel3;
        }

        public void setCategoryLevel3(Object categoryLevel3) {
            this.categoryLevel3 = categoryLevel3;
        }

        public Object getWebsiteSettingDTO() {
            return websiteSettingDTO;
        }

        public void setWebsiteSettingDTO(Object websiteSettingDTO) {
            this.websiteSettingDTO = websiteSettingDTO;
        }

        public Object getPriceFormat() {
            return priceFormat;
        }

        public void setPriceFormat(Object priceFormat) {
            this.priceFormat = priceFormat;
        }

        public Object getMarketPriceFormat() {
            return marketPriceFormat;
        }

        public void setMarketPriceFormat(Object marketPriceFormat) {
            this.marketPriceFormat = marketPriceFormat;
        }

        public Object getSpu() {
            return spu;
        }

        public void setSpu(Object spu) {
            this.spu = spu;
        }

        public Object getExtensionInfoList() {
            return extensionInfoList;
        }

        public void setExtensionInfoList(Object extensionInfoList) {
            this.extensionInfoList = extensionInfoList;
        }

        public static class BrandBean {
            /**
             * id : 65
             * name : JOYROOM
             * url : http://
             * desc : &nbsp;
             * logo : https://pic.21chinamall.com/cf5ce24663d14129b33a50ec412a8ad7.png
             * aptitude :
             * keywords : Joyroom|机乐堂
             * setting : a:1:{s:14:"brand_template";s:1:"0";}
             * order : 0
             * favCount : 1
             */

            private int id;
            private String name;
            private String url;
            private String desc;
            private String logo;
            private String aptitude;
            private String keywords;
            private String setting;
            private int order;
            private int favCount;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getAptitude() {
                return aptitude;
            }

            public void setAptitude(String aptitude) {
                this.aptitude = aptitude;
            }

            public String getKeywords() {
                return keywords;
            }

            public void setKeywords(String keywords) {
                this.keywords = keywords;
            }

            public String getSetting() {
                return setting;
            }

            public void setSetting(String setting) {
                this.setting = setting;
            }

            public int getOrder() {
                return order;
            }

            public void setOrder(int order) {
                this.order = order;
            }

            public int getFavCount() {
                return favCount;
            }

            public void setFavCount(int favCount) {
                this.favCount = favCount;
            }
        }
    }

    public static class SortBean {
        /**
         * direction : ASC
         * property : price
         * ignoreCase : false
         * nullHandling : NATIVE
         * ascending : true
         */

        private String direction;
        private String property;
        private boolean ignoreCase;
        private String nullHandling;
        private boolean ascending;

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public String getProperty() {
            return property;
        }

        public void setProperty(String property) {
            this.property = property;
        }

        public boolean isIgnoreCase() {
            return ignoreCase;
        }

        public void setIgnoreCase(boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
        }

        public String getNullHandling() {
            return nullHandling;
        }

        public void setNullHandling(String nullHandling) {
            this.nullHandling = nullHandling;
        }

        public boolean isAscending() {
            return ascending;
        }

        public void setAscending(boolean ascending) {
            this.ascending = ascending;
        }
    }
}

package com.example.recyclerview18022022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoodModel {
    private int image;
    private float price;
    private boolean isFavorite;
    private float rating;
    private int totalUserVotes;
    private String name;
    private String mainIngredient;

    public FoodModel(int image, float price, boolean isFavorite, float rating, int totalUserVotes, String name, String mainIngredient) {
        this.image = image;
        this.price = price;
        this.isFavorite = isFavorite;
        this.rating = rating;
        this.totalUserVotes = totalUserVotes;
        this.name = name;
        this.mainIngredient = mainIngredient;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getTotalUserVotes() {
        return totalUserVotes;
    }

    public void setTotalUserVotes(int totalUserVotes) {
        this.totalUserVotes = totalUserVotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    @Override
    public String toString() {
        return "FoodModel{" +
                "image=" + image +
                ", price=" + price +
                ", isFavorite=" + isFavorite +
                ", rating=" + rating +
                ", totalUserVotes=" + totalUserVotes +
                ", name='" + name + '\'' +
                ", mainIngredient='" + mainIngredient + '\'' +
                '}';
    }

    //data mock : d???? li????u gia??
    public static List<FoodModel> getMocks(){
        return new ArrayList<FoodModel>(Arrays.asList(
                new FoodModel(
                        R.drawable.image_anh_quan_my_kho,
                        2.5f,
                        true,
                        4.5f,
                        25,
                        "Anh Qu??n - M?? Kh?? G?? Quay & H??? Ti???u M?? S???i C???o",
                        "Ga?? Quay"
                ),
                new FoodModel(
                        R.drawable.image_bun_tro,
                        2.5f,
                        true,
                        4.5f,
                        25,
                        "BUMTRO - B??n Tr???n Nam B??? - Kinh D????ng V????ng",
                        "Bu??n tr????n"
                ),
                new FoodModel(
                        R.drawable.image_com_tam_minh_long,
                        1.5f,
                        false,
                        4.5f,
                        25,
                        "C??m T???m Minh Long - Nguy???n Th??? Th???p",
                        "C??m s??????n"
                ),
                new FoodModel(
                        R.drawable.image_tra_sua_toco_toco,
                        2f,
                        true,
                        4.5f,
                        25,
                        "TocoToco Bubble Tea - T??? Quang B???u",
                        "Tra?? s????a Panda"
                ),
                new FoodModel(
                        R.drawable.image_bun_thit_nuong,
                        1.5f,
                        false,
                        4.5f,
                        25,
                        "Anh Th?? - B??nh M?? & B??n Th???t N?????ng",
                        "Bu??n thi??t n??????ng"
                ),
                new FoodModel(
                        R.drawable.image_guchi_tokbokki,
                        3.5f,
                        true,
                        4.5f,
                        25,
                        "GuChi - Tokbokki, KimBap & C??m Tr???n - Ph???m V??n ?????ng",
                        "Tokbokki"
                ),
                new FoodModel(
                        R.drawable.image_banh_trang_ut_hanh,
                        1f,
                        true,
                        4.5f,
                        25,
                        "B??nh Tr??ng ??t H???nh",
                        "Ba??nh tra??ng cu????n"
                ),
                new FoodModel(
                        R.drawable.image_mi_kho_minkee,
                        3f,
                        true,
                        4.5f,
                        25,
                        "Min Kee - M?? Kh?? & Tr?? Hong Kong",
                        "Mi?? kh??"
                ),
                new FoodModel(
                        R.drawable.image_bun_dau_mam_tom,
                        3.8f,
                        true,
                        4.5f,
                        25,
                        "B??n ?????u M???m T??m Ti???u Mu???i - ???????ng D5",
                        "Bu??n ??????u th????p c????m"
                ),
                new FoodModel(
                        R.drawable.image_bun_bo,
                        3.5f,
                        true,
                        4.5f,
                        25,
                        "B??n B?? Hu??? Thanh Long",
                        "Bu??n bo?? th????p c????m"
                )
        ));
    }
}

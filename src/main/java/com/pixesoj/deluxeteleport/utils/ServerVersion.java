package com.pixesoj.deluxeteleport.utils;

public enum ServerVersion {
    v1_8,
    v1_8_1,
    v1_8_2,
    v1_8_3,
    v1_9,
    v1_9_1,
    v1_9_2,
    v1_9_3,
    v1_9_4,
    v1_10,
    v1_10_1,
    v1_10_2,
    v1_11,
    v1_11_1,
    v1_11_2,
    v1_12,
    v1_12_1,
    v1_12_2,
    v1_13,
    v1_13_1,
    v1_13_2,
    v1_14,
    v1_14_1,
    v1_14_2,
    v1_14_3,
    v1_14_4,
    v1_15,
    v1_15_1,
    v1_15_2,
    v1_16,
    v1_16_1,
    v1_16_2,
    v1_16_3,
    v1_16_4,
    v1_16_5,
    v1_17,
    v1_17_1,
    v1_18,
    v1_18_1,
    v1_18_2,
    v1_19,
    v1_19_1,
    v1_19_2,
    v1_19_3,
    v1_19_4,
    v1_20,
    v1_20_1,
    v1_20_2,
    v1_20_3,
    v1_20_4,
    v1_20_5,
    v1_20_6,
    v1_21,
    v1_21_1,
    v1_21_2,
    v1_21_3,
    v1_21_4;


    public static boolean serverVersionGreaterEqualThan(ServerVersion version1Str, ServerVersion version2Str) {
        return version1Str.ordinal() >= version2Str.ordinal();
    }
}

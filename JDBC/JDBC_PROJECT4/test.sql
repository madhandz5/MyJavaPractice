SELECT * FROM TB_MEMBER WHERE M_ID = 'madhandz5' and M_PASSWORD = 'dhckddud';


SELECT RM_RETURN_YN, TRM.RM_IDX, TB.B_BNO, TC.C_INFO, TB.B_TITLE, TB.B_AUTHOR, TRB.RB_REGDATE, TRB.RB_RETURN_DATE, TRB.RB_EXTENTION_CNT FROM TB_RENT_MASTER TRM JOIN TB_RENT_BOOK TRB ON (TRM.RM_IDX=TRB.RM_IDX)  JOIN TB_BOOK TB ON (TB.B_BNO=TRB.B_BNO) JOIN TB_CODE TC ON (TB.B_CATEGORY = TC.C_CODE) WHERE TRM.RM_IDX = 100000;
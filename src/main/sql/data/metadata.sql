DROP TABLE ESPDMETA;

CREATE TABLE ESPDMETA
(
meta_id NUMBER(10),
identifier VARCHAR(100 CHAR),
title_code VARCHAR(100 CHAR),
tooltip_code VARCHAR(100 CHAR),
date_modified DATE,
date_added DATE
);

--top level
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (0, 'f48b8736-d44f-48ce-885a-3c151998d294', 'crit_top_title_grounds_criminal_conv', null, SYSDATE, SYSDATE);
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (1, 'ff81c486-4a4f-4bdd-955c-0758c584ca1b', 'crit_top_title_grounds_payment_taxes', null, SYSDATE, SYSDATE);
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (2, '3f25d684-c54b-44b6-b690-27b1db257194', 'crit_top_title_insolvency_conflicts', null, SYSDATE, SYSDATE);

--childs
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (3, '6a2cf8af-fea7-4472-b718-b4968f1d852d', 'crit_eu_title_grounds_criminal_conv', 'crit_eu_tooltip_grounds_criminal_conv', SYSDATE, SYSDATE);
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (4, '923172a3-dedd-4f7c-94d6-ce44a7cebc19', 'crit_eu_title_corruption', 'crit_eu_tooltip_corruption', SYSDATE, SYSDATE);
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (5, '49976d1d-eed1-44d3-9c1f-7a85b1a1243c', 'crit_eu_title_fraud', 'crit_eu_tooltip_fraud', SYSDATE, SYSDATE);
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (6, '7be9ba86-a0d6-473a-8d9b-d4bb699d92d6', 'crit_eu_title_terrorist', 'crit_eu_tooltip_terrorist', SYSDATE, SYSDATE);
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (7, '09449a6f-0428-4f80-91b8-f180be466fac', 'crit_eu_title_money_laundering', 'crit_eu_tooltip_money_laundering', SYSDATE, SYSDATE);
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (8, 'bdb7e552-6b26-4b26-90a9-aea7bf09daec', 'crit_eu_title_child_labour', 'crit_eu_tooltip_child_labour', SYSDATE, SYSDATE);
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (9, 'eceadad8-1383-4d21-884a-b41ad2e482f2', 'crit_eu_title_payment_taxes', null, SYSDATE, SYSDATE);
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (10, '2ade7445-fa7f-488f-97ec-534a483bd9a4', 'crit_eu_title_payment_social_security', null, SYSDATE, SYSDATE);
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (11, '77bad49c-16b2-467a-8a3a-56212f5cb182', 'crit_eu_title_breaching_obligations', 'crit_eu_tooltip_breaching_obligations', SYSDATE, SYSDATE);
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (12, 'a576aabd-c0a7-4697-8345-80939ba4cca4', 'crit_eu_title_bankrupt', null, SYSDATE, SYSDATE);
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (13, 'dffa18cb-7954-4542-954c-df3da254f42f', 'crit_eu_title_guilty_misconduct', null, SYSDATE, SYSDATE);
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (14, '819786c2-a52b-4fcb-88fe-c2b1db48de62', 'crit_eu_title_agreement_economic', null, SYSDATE, SYSDATE);
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (15, 'faaf1ac2-9dc6-4cf6-a40f-1b01be18a252', 'crit_eu_title_conflict_interest', null, SYSDATE, SYSDATE);
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (16, '37a94078-2944-44f6-b321-9c51ba3c434b', 'crit_eu_title_involvment', null, SYSDATE, SYSDATE);
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (17, 'd5220cc1-fb57-486e-9c17-86e0fcfee3f9', 'crit_eu_title_early_termination', null, SYSDATE, SYSDATE);
INSERT INTO ESPDMETA (META_ID, IDENTIFIER, TITLE_CODE, TOOLTIP_CODE, DATE_MODIFIED, DATE_ADDED) VALUES (18, 'bca9e868-70c4-46f4-ae1f-21fa29b417d4', 'crit_eu_title_guilty_misinterpretation', null, SYSDATE, SYSDATE);

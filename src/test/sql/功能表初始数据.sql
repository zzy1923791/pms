INSERT INTO
  sys_code_functionsystem(c_system_name)
    VALUES
      ('AMS'),('BMS'),('CMS');

INSERT INTO
  sys_code_functionservice(c_service_name,i_system_key)
    VALUES
      ('AMS_SV11',1),('AMS_SV12',1),('AMS_SV13',1),
      ('AMS_SV21',2),('AMS_SV22',2),('AMS_SV23',2),
      ('AMS_SV31',3),('AMS_SV32',3),('AMS_SV33',3);

INSERT INTO
  sys_code_function(c_function_name,c_function_uri,i_service_key)
    VALUES
      ('AMA_SV11_F111','/AMA_SV11_F111',1),
      ('AMA_SV11_F112','/AMA_SV11_F112',1),
      ('AMA_SV11_F113','/AMA_SV11_F113',1),

      ('AMA_SV12_F121','/AMA_SV12_F121',2),
      ('AMA_SV12_F122','/AMA_SV12_F122',2),
      ('AMA_SV12_F123','/AMA_SV12_F123',2),

      ('AMA_SV13_F131','/AMA_SV13_F131',3),
      ('AMA_SV13_F132','/AMA_SV13_F132',3),
      ('AMA_SV13_F133','/AMA_SV13_F133',3),


      ('AMA_SV21_F211','/AMA_SV21_F211',4),
      ('AMA_SV21_F212','/AMA_SV21_F212',4),
      ('AMA_SV21_F213','/AMA_SV21_F213',4),

      ('AMA_SV22_F221','/AMA_SV22_F221',5),
      ('AMA_SV22_F222','/AMA_SV22_F222',5),
      ('AMA_SV22_F223','/AMA_SV22_F223',5),

      ('AMA_SV23_F231','/AMA_SV23_F231',6),
      ('AMA_SV23_F232','/AMA_SV23_F232',6),
      ('AMA_SV23_F233','/AMA_SV23_F233',6),


      ('AMA_SV31_F311','/AMA_SV31_F311',7),
      ('AMA_SV31_F312','/AMA_SV31_F312',7),
      ('AMA_SV31_F313','/AMA_SV31_F313',7),

      ('AMA_SV32_F321','/AMA_SV32_F321',8),
      ('AMA_SV32_F322','/AMA_SV32_F322',8),
      ('AMA_SV32_F323','/AMA_SV32_F323',8),

      ('AMA_SV33_F331','/AMA_SV33_F331',9),
      ('AMA_SV33_F332','/AMA_SV33_F332',9),
      ('AMA_SV33_F333','/AMA_SV33_F333',9);
INSERT INTO device_type (type, description) VALUES ('MFU', 'МФУ');
INSERT INTO device_type (type, description) VALUES ('CAM', 'IP камера');
INSERT INTO device_type (type, description) VALUES ('TEL', 'IP телефон');

INSERT INTO device_settings(dns, gateway, ip_adr, mask, url_page_count)
VALUES ('192.168.1.7', '192.168.1.251', '192.168.1.20', '255.255.255.0', '/info_configuration.html?tab=Status&menu=DevConfig');
INSERT INTO device_settings(dns, gateway, ip_adr, mask, url_page_count)
VALUES ('192.168.1.7', '192.168.1.251', '192.168.1.21', '255.255.255.0', '/info_configuration.html?tab=Status&menu=DevConfig');
INSERT INTO device_settings(dns, gateway, ip_adr, mask, url_page_count)
VALUES ('192.168.1.7', '192.168.1.251', '192.168.1.22', '255.255.255.0', '/info_configuration.html?tab=Status&menu=DevConfig');
INSERT INTO device_settings(dns, gateway, ip_adr, mask, url_page_count)
VALUES ('192.168.1.7', '192.168.1.251', '192.168.1.23', '255.255.255.0', '/info_configuration.html?tab=Status&menu=DevConfig');
INSERT INTO device_settings(dns, gateway, ip_adr, mask, url_page_count)
VALUES ('192.168.1.7', '192.168.1.251', '192.168.1.24', '255.255.255.0', '/info_configuration.html?tab=Status&menu=DevConfig');
INSERT INTO device_settings(dns, gateway, ip_adr, mask, url_page_count)
VALUES ('192.168.1.7', '192.168.1.251', '192.168.1.25', '255.255.255.0', '/info_configuration.html?tab=Status&menu=DevConfig');
INSERT INTO device_settings(dns, gateway, ip_adr, mask, url_page_count)
VALUES ('192.168.1.7', '192.168.1.251', '192.168.1.28', '255.255.255.0', '/info_configuration.html?tab=Status&menu=DevConfig');
INSERT INTO device_settings(dns, gateway, ip_adr, mask, url_page_count)
VALUES ('192.168.1.7', '192.168.1.251', '192.168.1.27', '255.255.255.0', '/info_configuration.html?tab=Status&menu=DevConfig');
INSERT INTO device_settings(dns, gateway, ip_adr, mask, url_page_count)
VALUES ('192.168.1.7', '192.168.1.251', '192.168.1.29', '255.255.255.0', '/info_configuration.html?tab=Status&menu=DevConfig');
INSERT INTO device_settings(dns, gateway, ip_adr, mask, url_page_count)
VALUES ('192.168.1.7', '192.168.1.251', '192.168.1.30', '255.255.255.0', '/info_configuration.html?tab=Status&menu=DevConfig');



INSERT INTO device (model, serial_number, vendor, device_settings_id, device_type_id)
VALUES ('M1536dnf', 'CNG8G184WR', 'HP', 1, 1);
INSERT INTO device (model, serial_number, vendor, device_settings_id, device_type_id)
VALUES ('M225rdn', 'CNB6J9J45D', 'HP', 2, 1);
INSERT INTO device (model, serial_number, vendor, device_settings_id, device_type_id)
VALUES ('M227sdn', 'VNF3R20722', 'HP', 3, 1);
INSERT INTO device (model, serial_number, vendor, device_settings_id, device_type_id)
VALUES ('M1536dnf', 'CNC9C4DB2P', 'HP', 4, 1);
INSERT INTO device (model, serial_number, vendor, device_settings_id, device_type_id)
VALUES ('M276nw', 'CNF8G2V18Z', 'HP', 5, 1);
INSERT INTO device (model, serial_number, vendor, device_settings_id, device_type_id)
VALUES ('M1536dnf', 'CNG8G184VW', 'HP', 6, 1);
INSERT INTO device (model, serial_number, vendor, device_settings_id, device_type_id)
VALUES ('M426dw', 'PHBLM1Z631', 'HP', 7, 1);
INSERT INTO device (model, serial_number, vendor, device_settings_id, device_type_id)
VALUES ('M227sdn', 'VNCN900472', 'HP', 8, 1);
INSERT INTO device (model, serial_number, vendor, device_settings_id, device_type_id)
VALUES ('FS-1025MFP', 'R7S9108354', 'Kyocera', 9, 1);
INSERT INTO device (model, serial_number, vendor, device_settings_id, device_type_id)
VALUES ('M177fw', 'CNG6H68FJS', 'HP', 10, 1);

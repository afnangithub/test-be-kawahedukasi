-- No 3.1
SELECT * FROM `kawahedukasi` WHERE 1 ORDER BY gaji DESC LIMIT 1;
-- No 3.2
SELECT * FROM `kawahedukasi` WHERE `kelas`='BACKEND' ORDER BY gaji DESC, nilai DESC LIMIT 1;
-- No 3.3
SELECT COUNT(*) AS `jumlah_peserta_kelas_frontend` FROM `kawahedukasi` WHERE `kelas`='FRONTEND';
-- No 3.4
SELECT * FROM `kawahedukasi` WHERE `kelas`='FRONTEND' ORDER BY jumlah_kehadiran DESC, nilai DESC LIMIT 1;
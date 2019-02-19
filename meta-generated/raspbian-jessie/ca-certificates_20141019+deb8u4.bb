PACKAGES = "${PN} ca-certificates"
PROVIDES = "ca-certificates"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/c/ca-certificates/ca-certificates_20141019+deb8u4_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_ca-certificates = "ca-certificates_20141019+deb8u4_all.deb"
SRC_URI[deb0.sha256sum] = "df55d3ec4f25868d367471411be80a3a117d152419f505068893bfc0f76fa817"
SRC_URI[deb0.md5sum] = "9bbfae9d2b23d12709a0246a1f255ddc"

RDEPENDS_${PN} = "debconf (>= 0.5) openssl (>= 1.0.0)"
DEPENDS = "debconf openssl"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/sbin/update-ca-certificates \
    ./usr/share/ca-certificates/mozilla/ACCVRAIZ1.crt \
    ./usr/share/ca-certificates/mozilla/AC_RAIZ_FNMT-RCM.crt \
    ./usr/share/ca-certificates/mozilla/AC_Raíz_Certicámara_S.A..crt \
    ./usr/share/ca-certificates/mozilla/Actalis_Authentication_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/AddTrust_External_Root.crt \
    ./usr/share/ca-certificates/mozilla/AddTrust_Low-Value_Services_Root.crt \
    ./usr/share/ca-certificates/mozilla/AffirmTrust_Commercial.crt \
    ./usr/share/ca-certificates/mozilla/AffirmTrust_Networking.crt \
    ./usr/share/ca-certificates/mozilla/AffirmTrust_Premium.crt \
    ./usr/share/ca-certificates/mozilla/AffirmTrust_Premium_ECC.crt \
    ./usr/share/ca-certificates/mozilla/Amazon_Root_CA_1.crt \
    ./usr/share/ca-certificates/mozilla/Amazon_Root_CA_2.crt \
    ./usr/share/ca-certificates/mozilla/Amazon_Root_CA_3.crt \
    ./usr/share/ca-certificates/mozilla/Amazon_Root_CA_4.crt \
    ./usr/share/ca-certificates/mozilla/Atos_TrustedRoot_2011.crt \
    ./usr/share/ca-certificates/mozilla/Autoridad_de_Certificacion_Firmaprofesional_CIF_A62634068.crt \
    ./usr/share/ca-certificates/mozilla/Baltimore_CyberTrust_Root.crt \
    ./usr/share/ca-certificates/mozilla/Buypass_Class_2_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/Buypass_Class_3_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/CA_Disig_Root_R2.crt \
    ./usr/share/ca-certificates/mozilla/CFCA_EV_ROOT.crt \
    ./usr/share/ca-certificates/mozilla/COMODO_Certification_Authority.crt \
    ./usr/share/ca-certificates/mozilla/COMODO_ECC_Certification_Authority.crt \
    ./usr/share/ca-certificates/mozilla/COMODO_RSA_Certification_Authority.crt \
    ./usr/share/ca-certificates/mozilla/Camerfirma_Chambers_of_Commerce_Root.crt \
    ./usr/share/ca-certificates/mozilla/Camerfirma_Global_Chambersign_Root.crt \
    ./usr/share/ca-certificates/mozilla/Certigna.crt \
    ./usr/share/ca-certificates/mozilla/Certinomis_-_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/Certplus_Class_2_Primary_CA.crt \
    ./usr/share/ca-certificates/mozilla/Certplus_Root_CA_G1.crt \
    ./usr/share/ca-certificates/mozilla/Certplus_Root_CA_G2.crt \
    ./usr/share/ca-certificates/mozilla/Certum_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/Certum_Trusted_Network_CA.crt \
    ./usr/share/ca-certificates/mozilla/Certum_Trusted_Network_CA_2.crt \
    ./usr/share/ca-certificates/mozilla/Chambers_of_Commerce_Root_-_2008.crt \
    ./usr/share/ca-certificates/mozilla/ComSign_CA.crt \
    ./usr/share/ca-certificates/mozilla/Comodo_AAA_Services_root.crt \
    ./usr/share/ca-certificates/mozilla/Cybertrust_Global_Root.crt \
    ./usr/share/ca-certificates/mozilla/D-TRUST_Root_CA_3_2013.crt \
    ./usr/share/ca-certificates/mozilla/D-TRUST_Root_Class_3_CA_2_2009.crt \
    ./usr/share/ca-certificates/mozilla/D-TRUST_Root_Class_3_CA_2_EV_2009.crt \
    ./usr/share/ca-certificates/mozilla/DST_Root_CA_X3.crt \
    ./usr/share/ca-certificates/mozilla/Deutsche_Telekom_Root_CA_2.crt \
    ./usr/share/ca-certificates/mozilla/DigiCert_Assured_ID_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/DigiCert_Assured_ID_Root_G2.crt \
    ./usr/share/ca-certificates/mozilla/DigiCert_Assured_ID_Root_G3.crt \
    ./usr/share/ca-certificates/mozilla/DigiCert_Global_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/DigiCert_Global_Root_G2.crt \
    ./usr/share/ca-certificates/mozilla/DigiCert_Global_Root_G3.crt \
    ./usr/share/ca-certificates/mozilla/DigiCert_High_Assurance_EV_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/DigiCert_Trusted_Root_G4.crt \
    ./usr/share/ca-certificates/mozilla/E-Tugra_Certification_Authority.crt \
    ./usr/share/ca-certificates/mozilla/EC-ACC.crt \
    ./usr/share/ca-certificates/mozilla/EE_Certification_Centre_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/Entrust.net_Premium_2048_Secure_Server_CA.crt \
    ./usr/share/ca-certificates/mozilla/Entrust_Root_Certification_Authority.crt \
    ./usr/share/ca-certificates/mozilla/Entrust_Root_Certification_Authority_-_EC1.crt \
    ./usr/share/ca-certificates/mozilla/Entrust_Root_Certification_Authority_-_G2.crt \
    ./usr/share/ca-certificates/mozilla/GDCA_TrustAUTH_R5_ROOT.crt \
    ./usr/share/ca-certificates/mozilla/GeoTrust_Global_CA.crt \
    ./usr/share/ca-certificates/mozilla/GeoTrust_Primary_Certification_Authority.crt \
    ./usr/share/ca-certificates/mozilla/GeoTrust_Primary_Certification_Authority_-_G2.crt \
    ./usr/share/ca-certificates/mozilla/GeoTrust_Primary_Certification_Authority_-_G3.crt \
    ./usr/share/ca-certificates/mozilla/GeoTrust_Universal_CA.crt \
    ./usr/share/ca-certificates/mozilla/GeoTrust_Universal_CA_2.crt \
    ./usr/share/ca-certificates/mozilla/GlobalSign_ECC_Root_CA_-_R4.crt \
    ./usr/share/ca-certificates/mozilla/GlobalSign_ECC_Root_CA_-_R5.crt \
    ./usr/share/ca-certificates/mozilla/GlobalSign_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/GlobalSign_Root_CA_-_R2.crt \
    ./usr/share/ca-certificates/mozilla/GlobalSign_Root_CA_-_R3.crt \
    ./usr/share/ca-certificates/mozilla/Global_Chambersign_Root_-_2008.crt \
    ./usr/share/ca-certificates/mozilla/Go_Daddy_Class_2_CA.crt \
    ./usr/share/ca-certificates/mozilla/Go_Daddy_Root_Certificate_Authority_-_G2.crt \
    ./usr/share/ca-certificates/mozilla/Hellenic_Academic_and_Research_Institutions_ECC_RootCA_2015.crt \
    ./usr/share/ca-certificates/mozilla/Hellenic_Academic_and_Research_Institutions_RootCA_2011.crt \
    ./usr/share/ca-certificates/mozilla/Hellenic_Academic_and_Research_Institutions_RootCA_2015.crt \
    ./usr/share/ca-certificates/mozilla/Hongkong_Post_Root_CA_1.crt \
    ./usr/share/ca-certificates/mozilla/ISRG_Root_X1.crt \
    ./usr/share/ca-certificates/mozilla/IdenTrust_Commercial_Root_CA_1.crt \
    ./usr/share/ca-certificates/mozilla/IdenTrust_Public_Sector_Root_CA_1.crt \
    ./usr/share/ca-certificates/mozilla/Izenpe.com.crt \
    ./usr/share/ca-certificates/mozilla/LuxTrust_Global_Root_2.crt \
    ./usr/share/ca-certificates/mozilla/Microsec_e-Szigno_Root_CA_2009.crt \
    ./usr/share/ca-certificates/mozilla/NetLock_Arany_=Class_Gold=_Főtanúsítvány.crt \
    ./usr/share/ca-certificates/mozilla/Network_Solutions_Certificate_Authority.crt \
    ./usr/share/ca-certificates/mozilla/OISTE_WISeKey_Global_Root_GA_CA.crt \
    ./usr/share/ca-certificates/mozilla/OISTE_WISeKey_Global_Root_GB_CA.crt \
    ./usr/share/ca-certificates/mozilla/OpenTrust_Root_CA_G1.crt \
    ./usr/share/ca-certificates/mozilla/OpenTrust_Root_CA_G2.crt \
    ./usr/share/ca-certificates/mozilla/OpenTrust_Root_CA_G3.crt \
    ./usr/share/ca-certificates/mozilla/QuoVadis_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/QuoVadis_Root_CA_1_G3.crt \
    ./usr/share/ca-certificates/mozilla/QuoVadis_Root_CA_2.crt \
    ./usr/share/ca-certificates/mozilla/QuoVadis_Root_CA_2_G3.crt \
    ./usr/share/ca-certificates/mozilla/QuoVadis_Root_CA_3.crt \
    ./usr/share/ca-certificates/mozilla/QuoVadis_Root_CA_3_G3.crt \
    ./usr/share/ca-certificates/mozilla/S-TRUST_Universal_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/SSL.com_EV_Root_Certification_Authority_ECC.crt \
    ./usr/share/ca-certificates/mozilla/SSL.com_EV_Root_Certification_Authority_RSA_R2.crt \
    ./usr/share/ca-certificates/mozilla/SSL.com_Root_Certification_Authority_ECC.crt \
    ./usr/share/ca-certificates/mozilla/SSL.com_Root_Certification_Authority_RSA.crt \
    ./usr/share/ca-certificates/mozilla/SZAFIR_ROOT_CA2.crt \
    ./usr/share/ca-certificates/mozilla/SecureSign_RootCA11.crt \
    ./usr/share/ca-certificates/mozilla/SecureTrust_CA.crt \
    ./usr/share/ca-certificates/mozilla/Secure_Global_CA.crt \
    ./usr/share/ca-certificates/mozilla/Security_Communication_RootCA2.crt \
    ./usr/share/ca-certificates/mozilla/Security_Communication_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/Sonera_Class_2_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/Staat_der_Nederlanden_EV_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/Staat_der_Nederlanden_Root_CA_-_G2.crt \
    ./usr/share/ca-certificates/mozilla/Staat_der_Nederlanden_Root_CA_-_G3.crt \
    ./usr/share/ca-certificates/mozilla/Starfield_Class_2_CA.crt \
    ./usr/share/ca-certificates/mozilla/Starfield_Root_Certificate_Authority_-_G2.crt \
    ./usr/share/ca-certificates/mozilla/Starfield_Services_Root_Certificate_Authority_-_G2.crt \
    ./usr/share/ca-certificates/mozilla/SwissSign_Gold_CA_-_G2.crt \
    ./usr/share/ca-certificates/mozilla/SwissSign_Platinum_CA_-_G2.crt \
    ./usr/share/ca-certificates/mozilla/SwissSign_Silver_CA_-_G2.crt \
    ./usr/share/ca-certificates/mozilla/Swisscom_Root_CA_2.crt \
    ./usr/share/ca-certificates/mozilla/Symantec_Class_1_Public_Primary_Certification_Authority_-_G4.crt \
    ./usr/share/ca-certificates/mozilla/Symantec_Class_1_Public_Primary_Certification_Authority_-_G6.crt \
    ./usr/share/ca-certificates/mozilla/Symantec_Class_2_Public_Primary_Certification_Authority_-_G4.crt \
    ./usr/share/ca-certificates/mozilla/Symantec_Class_2_Public_Primary_Certification_Authority_-_G6.crt \
    ./usr/share/ca-certificates/mozilla/T-TeleSec_GlobalRoot_Class_2.crt \
    ./usr/share/ca-certificates/mozilla/T-TeleSec_GlobalRoot_Class_3.crt \
    ./usr/share/ca-certificates/mozilla/TC_TrustCenter_Class_3_CA_II.crt \
    ./usr/share/ca-certificates/mozilla/TUBITAK_Kamu_SM_SSL_Kok_Sertifikasi_-_Surum_1.crt \
    ./usr/share/ca-certificates/mozilla/TWCA_Global_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/TWCA_Root_Certification_Authority.crt \
    ./usr/share/ca-certificates/mozilla/Taiwan_GRCA.crt \
    ./usr/share/ca-certificates/mozilla/TeliaSonera_Root_CA_v1.crt \
    ./usr/share/ca-certificates/mozilla/TrustCor_ECA-1.crt \
    ./usr/share/ca-certificates/mozilla/TrustCor_RootCert_CA-1.crt \
    ./usr/share/ca-certificates/mozilla/TrustCor_RootCert_CA-2.crt \
    ./usr/share/ca-certificates/mozilla/Trustis_FPS_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/TÜRKTRUST_Elektronik_Sertifika_Hizmet_Sağlayıcısı_H5.crt \
    ./usr/share/ca-certificates/mozilla/USERTrust_ECC_Certification_Authority.crt \
    ./usr/share/ca-certificates/mozilla/USERTrust_RSA_Certification_Authority.crt \
    ./usr/share/ca-certificates/mozilla/UTN_USERFirst_Email_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/VeriSign_Class_3_Public_Primary_Certification_Authority_-_G4.crt \
    ./usr/share/ca-certificates/mozilla/VeriSign_Class_3_Public_Primary_Certification_Authority_-_G5.crt \
    ./usr/share/ca-certificates/mozilla/VeriSign_Universal_Root_Certification_Authority.crt \
    ./usr/share/ca-certificates/mozilla/Verisign_Class_1_Public_Primary_Certification_Authority_-_G3.crt \
    ./usr/share/ca-certificates/mozilla/Verisign_Class_2_Public_Primary_Certification_Authority_-_G3.crt \
    ./usr/share/ca-certificates/mozilla/Verisign_Class_3_Public_Primary_Certification_Authority_-_G3.crt \
    ./usr/share/ca-certificates/mozilla/Visa_eCommerce_Root.crt \
    ./usr/share/ca-certificates/mozilla/XRamp_Global_CA_Root.crt \
    ./usr/share/ca-certificates/mozilla/certSIGN_ROOT_CA.crt \
    ./usr/share/ca-certificates/mozilla/ePKI_Root_Certification_Authority.crt \
    ./usr/share/ca-certificates/mozilla/thawte_Primary_Root_CA.crt \
    ./usr/share/ca-certificates/mozilla/thawte_Primary_Root_CA_-_G2.crt \
    ./usr/share/ca-certificates/mozilla/thawte_Primary_Root_CA_-_G3.crt \
    ./usr/share/ca-certificates/spi-inc.org/spi-cacert-2008.crt \
    ./usr/share/doc/ca-certificates/NEWS.Debian.gz \
    ./usr/share/doc/ca-certificates/README.Debian \
    ./usr/share/doc/ca-certificates/changelog.gz \
    ./usr/share/doc/ca-certificates/copyright \
    ./usr/share/doc/ca-certificates/examples/ca-certificates-local/Makefile \
    ./usr/share/doc/ca-certificates/examples/ca-certificates-local/README \
    ./usr/share/doc/ca-certificates/examples/ca-certificates-local/debian/ca-certificates-local.triggers \
    ./usr/share/doc/ca-certificates/examples/ca-certificates-local/debian/changelog \
    ./usr/share/doc/ca-certificates/examples/ca-certificates-local/debian/compat \
    ./usr/share/doc/ca-certificates/examples/ca-certificates-local/debian/control \
    ./usr/share/doc/ca-certificates/examples/ca-certificates-local/debian/copyright \
    ./usr/share/doc/ca-certificates/examples/ca-certificates-local/debian/postrm \
    ./usr/share/doc/ca-certificates/examples/ca-certificates-local/debian/rules \
    ./usr/share/doc/ca-certificates/examples/ca-certificates-local/debian/source/format \
    ./usr/share/doc/ca-certificates/examples/ca-certificates-local/local/Local_Root_CA.crt \
    ./usr/share/doc/ca-certificates/examples/ca-certificates-local/local/Makefile \
    ./usr/share/man/man8/update-ca-certificates.8.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
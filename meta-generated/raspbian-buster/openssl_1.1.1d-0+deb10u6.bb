PACKAGES = "${PN} libssl1.1 openssl"
PROVIDES = "libssl1.1 openssl"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/o/openssl/libssl1.1_1.1.1d-0+deb10u6_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/o/openssl/openssl_1.1.1d-0+deb10u6_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libssl1.1 = "libssl1.1_1.1.1d-0+deb10u6_armhf.deb"
SRC_URI[deb0.sha256sum] = "a55b518586522461500fe10b675df1d0bff83ff7f9acf5a8573fd5d417d5d7a8"
SRC_URI[deb0.md5sum] = "de1cb32c29fd83d8bd963399e49b030d"
DEBFILENAME_openssl = "openssl_1.1.1d-0+deb10u6_armhf.deb"
SRC_URI[deb1.sha256sum] = "9f4d3a2e22e0668feaaa10fefcf3bcb4e1b30e8b2f2196253332ad1d8dcdb60f"
SRC_URI[deb1.md5sum] = "c80ecd84166e07bbd23bff47747bcaf1"

RDEPENDS_libssl1.1 = "debconf (>= 0.5) libc6 (>= 2.28)"
RDEPENDS_${PN} = "libc6 (>= 2.15) libssl1.1 (>= 1.1.1)"
DEPENDS = "debconf libc6"


inherit deb_group

FILES_libssl1.1 = " \
    ./usr/lib/arm-linux-gnueabihf/engines-1.1/afalg.so \
    ./usr/lib/arm-linux-gnueabihf/engines-1.1/capi.so \
    ./usr/lib/arm-linux-gnueabihf/engines-1.1/padlock.so \
    ./usr/lib/arm-linux-gnueabihf/libcrypto.so.1.1 \
    ./usr/lib/arm-linux-gnueabihf/libssl.so.1.1 \
    ./usr/share/doc/libssl1.1/NEWS.Debian.gz \
    ./usr/share/doc/libssl1.1/changelog.Debian.gz \
    ./usr/share/doc/libssl1.1/changelog.gz \
    ./usr/share/doc/libssl1.1/copyright\
"
FILES_${PN} = " \
    ./etc/ssl/openssl.cnf \
    ./usr/bin/c_rehash \
    ./usr/bin/openssl \
    ./usr/lib/ssl/certs \
    ./usr/lib/ssl/misc/CA.pl \
    ./usr/lib/ssl/misc/tsget \
    ./usr/lib/ssl/misc/tsget.pl \
    ./usr/lib/ssl/openssl.cnf \
    ./usr/lib/ssl/private \
    ./usr/share/doc/openssl/FAQ \
    ./usr/share/doc/openssl/HOWTO/certificates.txt.gz \
    ./usr/share/doc/openssl/HOWTO/keys.txt \
    ./usr/share/doc/openssl/HOWTO/proxy_certificates.txt.gz \
    ./usr/share/doc/openssl/NEWS.Debian.gz \
    ./usr/share/doc/openssl/NEWS.gz \
    ./usr/share/doc/openssl/README \
    ./usr/share/doc/openssl/README.Debian \
    ./usr/share/doc/openssl/README.ENGINE.gz \
    ./usr/share/doc/openssl/README.optimization \
    ./usr/share/doc/openssl/changelog.Debian.gz \
    ./usr/share/doc/openssl/changelog.gz \
    ./usr/share/doc/openssl/copyright \
    ./usr/share/doc/openssl/fingerprints.txt \
    ./usr/share/lintian/overrides/openssl \
    ./usr/share/man/man1/CA.pl.1ssl.gz \
    ./usr/share/man/man1/asn1parse.1ssl.gz \
    ./usr/share/man/man1/c_rehash.1ssl.gz \
    ./usr/share/man/man1/ca.1ssl.gz \
    ./usr/share/man/man1/ciphers.1ssl.gz \
    ./usr/share/man/man1/cms.1ssl.gz \
    ./usr/share/man/man1/crl.1ssl.gz \
    ./usr/share/man/man1/crl2pkcs7.1ssl.gz \
    ./usr/share/man/man1/dgst.1ssl.gz \
    ./usr/share/man/man1/dhparam.1ssl.gz \
    ./usr/share/man/man1/dsa.1ssl.gz \
    ./usr/share/man/man1/dsaparam.1ssl.gz \
    ./usr/share/man/man1/ec.1ssl.gz \
    ./usr/share/man/man1/ecparam.1ssl.gz \
    ./usr/share/man/man1/enc.1ssl.gz \
    ./usr/share/man/man1/engine.1ssl.gz \
    ./usr/share/man/man1/errstr.1ssl.gz \
    ./usr/share/man/man1/gendsa.1ssl.gz \
    ./usr/share/man/man1/genpkey.1ssl.gz \
    ./usr/share/man/man1/genrsa.1ssl.gz \
    ./usr/share/man/man1/list.1ssl.gz \
    ./usr/share/man/man1/nseq.1ssl.gz \
    ./usr/share/man/man1/ocsp.1ssl.gz \
    ./usr/share/man/man1/openssl-asn1parse.1ssl.gz \
    ./usr/share/man/man1/openssl-c_rehash.1ssl.gz \
    ./usr/share/man/man1/openssl-ca.1ssl.gz \
    ./usr/share/man/man1/openssl-ciphers.1ssl.gz \
    ./usr/share/man/man1/openssl-cms.1ssl.gz \
    ./usr/share/man/man1/openssl-crl.1ssl.gz \
    ./usr/share/man/man1/openssl-crl2pkcs7.1ssl.gz \
    ./usr/share/man/man1/openssl-dgst.1ssl.gz \
    ./usr/share/man/man1/openssl-dhparam.1ssl.gz \
    ./usr/share/man/man1/openssl-dsa.1ssl.gz \
    ./usr/share/man/man1/openssl-dsaparam.1ssl.gz \
    ./usr/share/man/man1/openssl-ec.1ssl.gz \
    ./usr/share/man/man1/openssl-ecparam.1ssl.gz \
    ./usr/share/man/man1/openssl-enc.1ssl.gz \
    ./usr/share/man/man1/openssl-engine.1ssl.gz \
    ./usr/share/man/man1/openssl-errstr.1ssl.gz \
    ./usr/share/man/man1/openssl-gendsa.1ssl.gz \
    ./usr/share/man/man1/openssl-genpkey.1ssl.gz \
    ./usr/share/man/man1/openssl-genrsa.1ssl.gz \
    ./usr/share/man/man1/openssl-list.1ssl.gz \
    ./usr/share/man/man1/openssl-nseq.1ssl.gz \
    ./usr/share/man/man1/openssl-ocsp.1ssl.gz \
    ./usr/share/man/man1/openssl-passwd.1ssl.gz \
    ./usr/share/man/man1/openssl-pkcs12.1ssl.gz \
    ./usr/share/man/man1/openssl-pkcs7.1ssl.gz \
    ./usr/share/man/man1/openssl-pkcs8.1ssl.gz \
    ./usr/share/man/man1/openssl-pkey.1ssl.gz \
    ./usr/share/man/man1/openssl-pkeyparam.1ssl.gz \
    ./usr/share/man/man1/openssl-pkeyutl.1ssl.gz \
    ./usr/share/man/man1/openssl-prime.1ssl.gz \
    ./usr/share/man/man1/openssl-rand.1ssl.gz \
    ./usr/share/man/man1/openssl-rehash.1ssl.gz \
    ./usr/share/man/man1/openssl-req.1ssl.gz \
    ./usr/share/man/man1/openssl-rsa.1ssl.gz \
    ./usr/share/man/man1/openssl-rsautl.1ssl.gz \
    ./usr/share/man/man1/openssl-s_client.1ssl.gz \
    ./usr/share/man/man1/openssl-s_server.1ssl.gz \
    ./usr/share/man/man1/openssl-s_time.1ssl.gz \
    ./usr/share/man/man1/openssl-sess_id.1ssl.gz \
    ./usr/share/man/man1/openssl-smime.1ssl.gz \
    ./usr/share/man/man1/openssl-speed.1ssl.gz \
    ./usr/share/man/man1/openssl-spkac.1ssl.gz \
    ./usr/share/man/man1/openssl-srp.1ssl.gz \
    ./usr/share/man/man1/openssl-storeutl.1ssl.gz \
    ./usr/share/man/man1/openssl-ts.1ssl.gz \
    ./usr/share/man/man1/openssl-tsget.1ssl.gz \
    ./usr/share/man/man1/openssl-verify.1ssl.gz \
    ./usr/share/man/man1/openssl-version.1ssl.gz \
    ./usr/share/man/man1/openssl-x509.1ssl.gz \
    ./usr/share/man/man1/openssl.1ssl.gz \
    ./usr/share/man/man1/passwd.1ssl.gz \
    ./usr/share/man/man1/pkcs12.1ssl.gz \
    ./usr/share/man/man1/pkcs7.1ssl.gz \
    ./usr/share/man/man1/pkcs8.1ssl.gz \
    ./usr/share/man/man1/pkey.1ssl.gz \
    ./usr/share/man/man1/pkeyparam.1ssl.gz \
    ./usr/share/man/man1/pkeyutl.1ssl.gz \
    ./usr/share/man/man1/prime.1ssl.gz \
    ./usr/share/man/man1/rand.1ssl.gz \
    ./usr/share/man/man1/rehash.1ssl.gz \
    ./usr/share/man/man1/req.1ssl.gz \
    ./usr/share/man/man1/rsa.1ssl.gz \
    ./usr/share/man/man1/rsautl.1ssl.gz \
    ./usr/share/man/man1/s_client.1ssl.gz \
    ./usr/share/man/man1/s_server.1ssl.gz \
    ./usr/share/man/man1/s_time.1ssl.gz \
    ./usr/share/man/man1/sess_id.1ssl.gz \
    ./usr/share/man/man1/smime.1ssl.gz \
    ./usr/share/man/man1/speed.1ssl.gz \
    ./usr/share/man/man1/spkac.1ssl.gz \
    ./usr/share/man/man1/srp.1ssl.gz \
    ./usr/share/man/man1/storeutl.1ssl.gz \
    ./usr/share/man/man1/ts.1ssl.gz \
    ./usr/share/man/man1/tsget.1ssl.gz \
    ./usr/share/man/man1/verify.1ssl.gz \
    ./usr/share/man/man1/version.1ssl.gz \
    ./usr/share/man/man1/x509.1ssl.gz \
    ./usr/share/man/man5/config.5ssl.gz \
    ./usr/share/man/man5/x509v3_config.5ssl.gz \
    ./usr/share/man/man7/Ed25519.7ssl.gz \
    ./usr/share/man/man7/Ed448.7ssl.gz \
    ./usr/share/man/man7/RAND.7ssl.gz \
    ./usr/share/man/man7/RAND_DRBG.7ssl.gz \
    ./usr/share/man/man7/RSA-PSS.7ssl.gz \
    ./usr/share/man/man7/SM2.7ssl.gz \
    ./usr/share/man/man7/X25519.7ssl.gz \
    ./usr/share/man/man7/X448.7ssl.gz \
    ./usr/share/man/man7/bio.7ssl.gz \
    ./usr/share/man/man7/crypto.7ssl.gz \
    ./usr/share/man/man7/ct.7ssl.gz \
    ./usr/share/man/man7/des_modes.7ssl.gz \
    ./usr/share/man/man7/evp.7ssl.gz \
    ./usr/share/man/man7/ossl_store-file.7ssl.gz \
    ./usr/share/man/man7/ossl_store.7ssl.gz \
    ./usr/share/man/man7/passphrase-encoding.7ssl.gz \
    ./usr/share/man/man7/scrypt.7ssl.gz \
    ./usr/share/man/man7/ssl.7ssl.gz \
    ./usr/share/man/man7/x509.7ssl.gz\
"

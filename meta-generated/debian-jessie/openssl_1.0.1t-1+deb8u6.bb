PACKAGES = "libssl1.0.0 openssl"
PROVIDES = "libssl1.0.0 openssl"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/o/openssl/libssl1.0.0_1.0.1t-1+deb8u6_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/o/openssl/openssl_1.0.1t-1+deb8u6_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libssl1.0.0 = "libssl1.0.0_1.0.1t-1+deb8u6_armhf.deb"
SRC_URI[deb0.sha256sum] = "73b73841facb66885147cefe0b2eef752d0c32d9749d238e7965c6a06a6ac8e2"
SRC_URI[deb0.md5sum] = "2d5d5d4e0879ae978997b870080e698d"
DEBFILENAME_openssl = "openssl_1.0.1t-1+deb8u6_armhf.deb"
SRC_URI[deb1.sha256sum] = "90a756e4c3d0bc3956c395d815e878d755d597126079bd6d45fec96f322a2a67"
SRC_URI[deb1.md5sum] = "a2b3331d8d16e141bb8d71d37fe10bed"

RDEPENDS_libssl1.0.0 = "libc6 (>= 2.11) debconf (>= 0.5)"
RDEPENDS_${PN} = "libc6 (>= 2.15) libssl1.0.0 (>= 1.0.1k-3+deb8u3)"
DEPENDS = "debconf libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libssl1.0.0 = " \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libchil.so \
	./usr/lib/arm-linux-gnueabihf/libcrypto.so.1.0.0 \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libpadlock.so \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/lib4758cca.so \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libcapi.so \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libaep.so \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libubsec.so \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libcswift.so \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libgost.so \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libnuron.so \
	./usr/share/doc/libssl1.0.0/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libsureware.so \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libatalla.so \
	./usr/share/doc/libssl1.0.0/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/openssl-1.0.0/engines/libgmp.so \
	./usr/share/doc/libssl1.0.0/copyright \
	./usr/lib/arm-linux-gnueabihf/libssl.so.1.0.0\
"
FILES_${PN} = " \
	./usr/share/man/man1/ec.1ssl.gz \
	./usr/share/doc/openssl/HOWTO/keys.txt \
	./usr/lib/ssl/misc/c_issuer \
	./usr/share/man/man1/pkey.1ssl.gz \
	./usr/share/man/man1/rsa.1ssl.gz \
	./usr/share/man/man1/openssl.1ssl.gz \
	./usr/share/man/man1/req.1ssl.gz \
	./usr/share/man/man1/ocsp.1ssl.gz \
	./usr/share/man/man1/c_rehash.1ssl.gz \
	./usr/share/man/man1/asn1parse.1ssl.gz \
	./usr/share/man/man1/rsautl.1ssl.gz \
	./usr/bin/c_rehash \
	./usr/lib/ssl/misc/CA.sh \
	./usr/share/man/man1/spkac.1ssl.gz \
	./usr/share/man/man1/ecparam.1ssl.gz \
	./usr/share/doc/openssl/changelog.gz \
	./usr/share/man/man1/dhparam.1ssl.gz \
	./usr/share/man/man1/verify.1ssl.gz \
	./usr/share/man/man1/sha1.1ssl.gz \
	./usr/share/man/man1/ca.1ssl.gz \
	./usr/share/man/man1/sha256.1ssl.gz \
	./usr/bin/openssl \
	./usr/lib/ssl/openssl.cnf \
	./usr/share/man/man5/x509v3_config.5ssl.gz \
	./usr/share/man/man5/config.5ssl.gz \
	./usr/share/man/man1/md5.1ssl.gz \
	./usr/share/man/man1/pkcs7.1ssl.gz \
	./usr/lib/ssl/misc/c_info \
	./usr/share/doc/openssl/README.Debian \
	./usr/lib/ssl/misc/c_hash \
	./etc/ssl/openssl.cnf \
	./usr/share/doc/openssl/fingerprints.txt \
	./usr/share/man/man1/smime.1ssl.gz \
	./usr/share/man/man1/pkeyutl.1ssl.gz \
	./usr/share/man/man1/genpkey.1ssl.gz \
	./usr/share/man/man1/s_client.1ssl.gz \
	./usr/share/man/man1/tsget.1ssl.gz \
	./usr/share/doc/openssl/README.gz \
	./usr/lib/ssl/private \
	./usr/share/doc/openssl/NEWS.gz \
	./usr/share/man/man1/sha512.1ssl.gz \
	./usr/share/man/man1/ts.1ssl.gz \
	./usr/share/man/man1/ripemd160.1ssl.gz \
	./usr/share/man/man1/s_server.1ssl.gz \
	./usr/share/man/man1/pkeyparam.1ssl.gz \
	./usr/share/man/man1/x509.1ssl.gz \
	./usr/share/man/man1/sess_id.1ssl.gz \
	./usr/share/man/man1/genrsa.1ssl.gz \
	./usr/share/man/man1/sha.1ssl.gz \
	./usr/share/doc/openssl/HOWTO/proxy_certificates.txt.gz \
	./usr/share/man/man1/dsa.1ssl.gz \
	./usr/share/doc/openssl/HOWTO/certificates.txt.gz \
	./usr/share/man/man1/ciphers.1ssl.gz \
	./usr/share/man/man1/md4.1ssl.gz \
	./usr/share/doc/openssl/standards.txt.gz \
	./usr/share/man/man1/s_time.1ssl.gz \
	./usr/share/man/man1/crl2pkcs7.1ssl.gz \
	./usr/share/doc/openssl/openssl.txt.gz \
	./usr/lib/ssl/misc/tsget \
	./usr/share/man/man1/pkcs12.1ssl.gz \
	./usr/share/man/man1/md2.1ssl.gz \
	./usr/share/man/man1/errstr.1ssl.gz \
	./usr/share/man/man1/CA.pl.1ssl.gz \
	./usr/share/man/man1/version.1ssl.gz \
	./usr/lib/ssl/misc/CA.pl \
	./usr/share/man/man1/pkcs8.1ssl.gz \
	./usr/share/man/man1/sha224.1ssl.gz \
	./usr/share/doc/openssl/copyright \
	./usr/share/man/man1/gendsa.1ssl.gz \
	./usr/share/man/man1/mdc2.1ssl.gz \
	./usr/share/man/man1/dsaparam.1ssl.gz \
	./usr/share/man/man1/crl.1ssl.gz \
	./usr/share/man/man1/nseq.1ssl.gz \
	./usr/share/doc/openssl/README.optimization \
	./usr/lib/ssl/certs \
	./usr/share/doc/openssl/openssl_button.gif \
	./usr/share/man/man1/dss1.1ssl.gz \
	./usr/share/man/man1/cms.1ssl.gz \
	./usr/share/man/man1/dgst.1ssl.gz \
	./usr/share/man/man1/passwd.1ssl.gz \
	./usr/share/doc/openssl/FAQ \
	./usr/share/doc/openssl/openssl_button.html \
	./usr/lib/ssl/misc/c_name \
	./usr/share/man/man1/sha384.1ssl.gz \
	./usr/share/man/man7/des_modes.7ssl.gz \
	./usr/share/man/man1/enc.1ssl.gz \
	./usr/share/man/man1/speed.1ssl.gz \
	./usr/share/doc/openssl/changelog.Debian.gz \
	./usr/share/man/man1/rand.1ssl.gz \
	./usr/share/doc/openssl/CHANGES.SSLeay.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

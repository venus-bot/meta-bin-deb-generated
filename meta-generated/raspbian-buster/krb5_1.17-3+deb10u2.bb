PACKAGES = "${PN} libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
PROVIDES = "libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libgssapi-krb5-2_1.17-3+deb10u2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libk5crypto3_1.17-3+deb10u2_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libkrb5-3_1.17-3+deb10u2_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libkrb5support0_1.17-3+deb10u2_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libgssapi-krb5-2 = "libgssapi-krb5-2_1.17-3+deb10u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "de087040f44e02d55581877c2209f6b9887f6bbcb86a5bc57ef54755fcc07bed"
SRC_URI[deb0.md5sum] = "5f7918f90ca77f1db736beeba4b606e0"
DEBFILENAME_libk5crypto3 = "libk5crypto3_1.17-3+deb10u2_armhf.deb"
SRC_URI[deb1.sha256sum] = "d41b24bba7fbbc105781bbd70e71d6e57f3683df192c32864151ebf1ce891eff"
SRC_URI[deb1.md5sum] = "78e1d842e18b690582d3f562dba090e4"
DEBFILENAME_libkrb5-3 = "libkrb5-3_1.17-3+deb10u2_armhf.deb"
SRC_URI[deb2.sha256sum] = "e40301c5b2d4a51af8dd2ae602ee810e10e277097b002a61ce253dd53021a549"
SRC_URI[deb2.md5sum] = "f9d088a22de9b88e5c0a771b3eec38dd"
DEBFILENAME_libkrb5support0 = "libkrb5support0_1.17-3+deb10u2_armhf.deb"
SRC_URI[deb3.sha256sum] = "b6e0e1c8bccc57cd68922e897dde93628bef81d3c23fe088f8252452c9d7a9ee"
SRC_URI[deb3.md5sum] = "a39be16326a64e07936e5bcb41cb0368"

RDEPENDS_libgssapi-${PN}-2 = "libc6 (>= 2.27) libcom-err2 (>= 1.43.9) libk5crypto3 (>= 1.16) libkeyutils1 (>= 1.4) libkrb5-3 (= 1.17-3+deb10u2) libkrb5support0 (>= 1.15~beta1)"
RDEPENDS_libk5crypto3 = "libc6 (>= 2.28) libkeyutils1 (>= 1.4) libkrb5support0 (>= 1.16)"
RDEPENDS_lib${PN}-3 = "libc6 (>= 2.28) libcom-err2 (>= 1.43.9) libk5crypto3 (>= 1.15~beta1) libkeyutils1 (>= 1.5.9) libkrb5support0 (= 1.17-3+deb10u2) libssl1.1 (>= 1.1.0)"
RDEPENDS_lib${PN}support0 = "libc6 (>= 2.8) libkeyutils1 (>= 1.4)"
DEPENDS = "libc6 libcom-err2 libkeyutils1 libssl1.1"


inherit deb_group

FILES_libgssapi-krb5-2 = " \
    ./usr/lib/arm-linux-gnueabihf/libgssapi_krb5.so.2 \
    ./usr/lib/arm-linux-gnueabihf/libgssapi_krb5.so.2.2 \
    ./usr/share/doc/libgssapi-krb5-2/NEWS.Debian.gz \
    ./usr/share/doc/libgssapi-krb5-2/changelog.Debian.gz \
    ./usr/share/doc/libgssapi-krb5-2/copyright \
    ./usr/share/lintian/overrides/libgssapi-krb5-2\
"
FILES_libk5crypto3 = " \
    ./usr/lib/arm-linux-gnueabihf/libk5crypto.so.3 \
    ./usr/lib/arm-linux-gnueabihf/libk5crypto.so.3.1 \
    ./usr/share/doc/libk5crypto3/NEWS.Debian.gz \
    ./usr/share/doc/libk5crypto3/changelog.Debian.gz \
    ./usr/share/doc/libk5crypto3/copyright\
"
FILES_libkrb5-3 = " \
    ./usr/lib/arm-linux-gnueabihf/krb5/plugins/preauth/spake.so \
    ./usr/lib/arm-linux-gnueabihf/libkrb5.so.3 \
    ./usr/lib/arm-linux-gnueabihf/libkrb5.so.3.3 \
    ./usr/share/doc/libkrb5-3/NEWS.Debian.gz \
    ./usr/share/doc/libkrb5-3/README.Debian \
    ./usr/share/doc/libkrb5-3/README.gz \
    ./usr/share/doc/libkrb5-3/changelog.Debian.gz \
    ./usr/share/doc/libkrb5-3/copyright \
    ./usr/share/lintian/overrides/libkrb5-3\
"
FILES_libkrb5support0 = " \
    ./usr/lib/arm-linux-gnueabihf/libkrb5support.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libkrb5support.so.0.1 \
    ./usr/share/doc/libkrb5support0/NEWS.Debian.gz \
    ./usr/share/doc/libkrb5support0/changelog.Debian.gz \
    ./usr/share/doc/libkrb5support0/copyright\
"

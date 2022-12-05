PACKAGES = "${PN} libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
PROVIDES = "libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libgssapi-krb5-2_1.17-3+deb10u5_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libk5crypto3_1.17-3+deb10u5_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libkrb5-3_1.17-3+deb10u5_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libkrb5support0_1.17-3+deb10u5_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libgssapi-krb5-2 = "libgssapi-krb5-2_1.17-3+deb10u5_armhf.deb"
SRC_URI[deb0.sha256sum] = "e0153f15b3a4d26621bf61c9d30b04515cd594358d3fd462cb3a2a147f2a6ce6"
SRC_URI[deb0.md5sum] = "03426f71eab9004da6c1056c729475f8"
DEBFILENAME_libk5crypto3 = "libk5crypto3_1.17-3+deb10u5_armhf.deb"
SRC_URI[deb1.sha256sum] = "bf69ff5d824a0713979ba7cff4d0305c330c4f978cd2d25f05f6f376177fc87c"
SRC_URI[deb1.md5sum] = "c09e788d1b90f9ed8b14ddbcf5862bb0"
DEBFILENAME_libkrb5-3 = "libkrb5-3_1.17-3+deb10u5_armhf.deb"
SRC_URI[deb2.sha256sum] = "cc0af391f2fd302a8b88868dab9ee1e0ad081601c984e01478b2d15854e0e7b9"
SRC_URI[deb2.md5sum] = "6105a13059bad742f2ec0a58f36507c5"
DEBFILENAME_libkrb5support0 = "libkrb5support0_1.17-3+deb10u5_armhf.deb"
SRC_URI[deb3.sha256sum] = "c713b21ea0d98daebe6370810e0a55e4293df91aea435dba701ecb81019f04a8"
SRC_URI[deb3.md5sum] = "c8307e0dd06927e1f642bdcd805d4c0c"

RDEPENDS_libgssapi-${PN}-2 = "libc6 (>= 2.27) libcom-err2 (>= 1.43.9) libk5crypto3 (>= 1.16) libkeyutils1 (>= 1.4) libkrb5-3 (= 1.17-3+deb10u5) libkrb5support0 (>= 1.15~beta1)"
RDEPENDS_libk5crypto3 = "libc6 (>= 2.28) libkeyutils1 (>= 1.4) libkrb5support0 (>= 1.16)"
RDEPENDS_lib${PN}-3 = "libc6 (>= 2.28) libcom-err2 (>= 1.43.9) libk5crypto3 (>= 1.15~beta1) libkeyutils1 (>= 1.5.9) libkrb5support0 (= 1.17-3+deb10u5) libssl1.1 (>= 1.1.0)"
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

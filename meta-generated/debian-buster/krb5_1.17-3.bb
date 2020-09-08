PACKAGES = "${PN} libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
PROVIDES = "libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/k/krb5/libgssapi-krb5-2_1.17-3_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/k/krb5/libk5crypto3_1.17-3_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/k/krb5/libkrb5-3_1.17-3_armhf.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/k/krb5/libkrb5support0_1.17-3_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libgssapi-krb5-2 = "libgssapi-krb5-2_1.17-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "d0e07abee996050dd5302347a252a0ddd27383bf98dd8e2398cec3c624d54119"
SRC_URI[deb0.md5sum] = "83981d4f6bc366f912688f3035f46120"
DEBFILENAME_libk5crypto3 = "libk5crypto3_1.17-3_armhf.deb"
SRC_URI[deb1.sha256sum] = "11847a69f545428da61c94c8dbf8c84a69f90b9097ffbe3b0f8efc4e47fc66b2"
SRC_URI[deb1.md5sum] = "f2cd25e524425259a741880c44b182ac"
DEBFILENAME_libkrb5-3 = "libkrb5-3_1.17-3_armhf.deb"
SRC_URI[deb2.sha256sum] = "0f2360cdfd4e2311ed487cb8be623e21c5761325dd025ec24d8bf874f518205d"
SRC_URI[deb2.md5sum] = "aabf401cde1e887ccf5af1448f09c534"
DEBFILENAME_libkrb5support0 = "libkrb5support0_1.17-3_armhf.deb"
SRC_URI[deb3.sha256sum] = "5fb37d0db429f25a292fd80c0ad0cc48e0af6be30f0842742e2910d55c35fe17"
SRC_URI[deb3.md5sum] = "0190cc545ca444ba537fb1b87618fe93"

RDEPENDS_libgssapi-${PN}-2 = "libc6 (>= 2.27) libcom-err2 (>= 1.43.9) libk5crypto3 (>= 1.16) libkeyutils1 (>= 1.4) libkrb5-3 (= 1.17-3) libkrb5support0 (>= 1.15~beta1)"
RDEPENDS_libk5crypto3 = "libc6 (>= 2.28) libkeyutils1 (>= 1.4) libkrb5support0 (>= 1.16)"
RDEPENDS_lib${PN}-3 = "libc6 (>= 2.28) libcom-err2 (>= 1.43.9) libk5crypto3 (>= 1.15~beta1) libkeyutils1 (>= 1.5.9) libkrb5support0 (= 1.17-3) libssl1.1 (>= 1.1.0)"
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

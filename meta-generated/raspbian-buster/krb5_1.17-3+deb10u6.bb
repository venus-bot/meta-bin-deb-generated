PACKAGES = "${PN} libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
PROVIDES = "libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libgssapi-krb5-2_1.17-3+deb10u6_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libk5crypto3_1.17-3+deb10u6_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libkrb5-3_1.17-3+deb10u6_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libkrb5support0_1.17-3+deb10u6_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libgssapi-krb5-2 = "libgssapi-krb5-2_1.17-3+deb10u6_armhf.deb"
SRC_URI[deb0.sha256sum] = "fdf1f60ee2b76c9de9b2e78d4814dc9ac8ddf8c4855ba238a4fd2243080d1914"
SRC_URI[deb0.md5sum] = "77425d9ae77e7cccafc3534055f26144"
DEBFILENAME_libk5crypto3 = "libk5crypto3_1.17-3+deb10u6_armhf.deb"
SRC_URI[deb1.sha256sum] = "7d74291235af5cf9c353c9ece636bf31ede6d9cd3373d2b9729b519003187beb"
SRC_URI[deb1.md5sum] = "b6a6232b50887ac3b214696b59e688d2"
DEBFILENAME_libkrb5-3 = "libkrb5-3_1.17-3+deb10u6_armhf.deb"
SRC_URI[deb2.sha256sum] = "6bae4f400e6c6dccaf2c5e0941cf3635c5900d0a6ecf04513edb0c19f716e9c7"
SRC_URI[deb2.md5sum] = "5b3d9c98d4502d565b3deeb29eacba5a"
DEBFILENAME_libkrb5support0 = "libkrb5support0_1.17-3+deb10u6_armhf.deb"
SRC_URI[deb3.sha256sum] = "f0abc7f0c07e9a4de730465dceb1d8e35b6682b9f701b1339aca24b5127d3cc8"
SRC_URI[deb3.md5sum] = "afd4126be8ccd16d883880442328fb79"

RDEPENDS_libgssapi-${PN}-2 = "libc6 (>= 2.27) libcom-err2 (>= 1.43.9) libk5crypto3 (>= 1.16) libkeyutils1 (>= 1.4) libkrb5-3 (= 1.17-3+deb10u6) libkrb5support0 (>= 1.15~beta1)"
RDEPENDS_libk5crypto3 = "libc6 (>= 2.28) libkeyutils1 (>= 1.4) libkrb5support0 (>= 1.16)"
RDEPENDS_lib${PN}-3 = "libc6 (>= 2.28) libcom-err2 (>= 1.43.9) libk5crypto3 (>= 1.15~beta1) libkeyutils1 (>= 1.5.9) libkrb5support0 (= 1.17-3+deb10u6) libssl1.1 (>= 1.1.0)"
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

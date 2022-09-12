PACKAGES = "${PN} libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
PROVIDES = "libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libgssapi-krb5-2_1.17-3+deb10u4_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libk5crypto3_1.17-3+deb10u4_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libkrb5-3_1.17-3+deb10u4_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libkrb5support0_1.17-3+deb10u4_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libgssapi-krb5-2 = "libgssapi-krb5-2_1.17-3+deb10u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "224b0578c766253f5b9c20666ffa7a22373d3a4661bcf11d8454c2c467a97ae1"
SRC_URI[deb0.md5sum] = "57171d9f6d5b19bac02bb95075e12331"
DEBFILENAME_libk5crypto3 = "libk5crypto3_1.17-3+deb10u4_armhf.deb"
SRC_URI[deb1.sha256sum] = "45393116a2764288141199570401a68d8c123925c67d144065aa8b36d9618f07"
SRC_URI[deb1.md5sum] = "de40c31c422799f33b3340daad55643b"
DEBFILENAME_libkrb5-3 = "libkrb5-3_1.17-3+deb10u4_armhf.deb"
SRC_URI[deb2.sha256sum] = "a4ea3e29ee4bd991366f92672780570b301c934f51da8d776881e31569e2fbd4"
SRC_URI[deb2.md5sum] = "79db6f655d36990837118780f4aec59a"
DEBFILENAME_libkrb5support0 = "libkrb5support0_1.17-3+deb10u4_armhf.deb"
SRC_URI[deb3.sha256sum] = "b3d63cb1e1377b4307fe7393b0f3f6af47b63f4081309a841ad5f6c100c1310c"
SRC_URI[deb3.md5sum] = "b34d3f8d61cab4acf288f9f9f3936df6"

RDEPENDS_libgssapi-${PN}-2 = "libc6 (>= 2.27) libcom-err2 (>= 1.43.9) libk5crypto3 (>= 1.16) libkeyutils1 (>= 1.4) libkrb5-3 (= 1.17-3+deb10u4) libkrb5support0 (>= 1.15~beta1)"
RDEPENDS_libk5crypto3 = "libc6 (>= 2.28) libkeyutils1 (>= 1.4) libkrb5support0 (>= 1.16)"
RDEPENDS_lib${PN}-3 = "libc6 (>= 2.28) libcom-err2 (>= 1.43.9) libk5crypto3 (>= 1.15~beta1) libkeyutils1 (>= 1.5.9) libkrb5support0 (= 1.17-3+deb10u4) libssl1.1 (>= 1.1.0)"
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

PACKAGES = "${PN} libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
PROVIDES = "libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libgssapi-krb5-2_1.17-3+deb10u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libk5crypto3_1.17-3+deb10u1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libkrb5-3_1.17-3+deb10u1_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/k/krb5/libkrb5support0_1.17-3+deb10u1_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libgssapi-krb5-2 = "libgssapi-krb5-2_1.17-3+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "72bdbec9bf4ce9e5201dd57ae466c363cda0c0f885e4ab035fa1c772135eb955"
SRC_URI[deb0.md5sum] = "1a9b05c497c3ff42639497364f156352"
DEBFILENAME_libk5crypto3 = "libk5crypto3_1.17-3+deb10u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "db5f52d646656aede0f2ad7feb1ef7cef432125715bff38393bac311356eb937"
SRC_URI[deb1.md5sum] = "bd1a5b7e52182bb4a1a4952b3709afae"
DEBFILENAME_libkrb5-3 = "libkrb5-3_1.17-3+deb10u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "3fc3e3d3e13ceb3fd851dcd9bb46e1e3626817c93242c1325bd6552f624f9d65"
SRC_URI[deb2.md5sum] = "f5848dc0c24748c8afb8c3e89b3227b0"
DEBFILENAME_libkrb5support0 = "libkrb5support0_1.17-3+deb10u1_armhf.deb"
SRC_URI[deb3.sha256sum] = "eaa051e1924d7a8cb3a458bccfdb0ed65b6c1928d0e70d62ded4874313037a91"
SRC_URI[deb3.md5sum] = "a729436a64f3ae415d5e5acef090ad0f"

RDEPENDS_libgssapi-${PN}-2 = "libc6 (>= 2.27) libcom-err2 (>= 1.43.9) libk5crypto3 (>= 1.16) libkeyutils1 (>= 1.4) libkrb5-3 (= 1.17-3+deb10u1) libkrb5support0 (>= 1.15~beta1)"
RDEPENDS_libk5crypto3 = "libc6 (>= 2.28) libkeyutils1 (>= 1.4) libkrb5support0 (>= 1.16)"
RDEPENDS_lib${PN}-3 = "libc6 (>= 2.28) libcom-err2 (>= 1.43.9) libk5crypto3 (>= 1.15~beta1) libkeyutils1 (>= 1.5.9) libkrb5support0 (= 1.17-3+deb10u1) libssl1.1 (>= 1.1.0)"
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

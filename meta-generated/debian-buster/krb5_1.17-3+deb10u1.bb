PACKAGES = "${PN} libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
PROVIDES = "libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/k/krb5/libgssapi-krb5-2_1.17-3+deb10u1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/k/krb5/libk5crypto3_1.17-3+deb10u1_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/k/krb5/libkrb5-3_1.17-3+deb10u1_armhf.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/k/krb5/libkrb5support0_1.17-3+deb10u1_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libgssapi-krb5-2 = "libgssapi-krb5-2_1.17-3+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "a0fe5b1790eb2ff850029acdd18d425a58b51a5ba5baf50b91a6218afe8bd291"
SRC_URI[deb0.md5sum] = "393c0ef552b305103c65fbdd67f5641a"
DEBFILENAME_libk5crypto3 = "libk5crypto3_1.17-3+deb10u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "bb456a9a0cf68446f4b7325112fd0f0cceda3f0ae382f94b732ba4638f9b1869"
SRC_URI[deb1.md5sum] = "f21708d4721f357ad3cf231cf7d92336"
DEBFILENAME_libkrb5-3 = "libkrb5-3_1.17-3+deb10u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "6ba4b70dd1772db4002d5933b1f9a37fbc8e4228da8740b00f46a22c29e9d510"
SRC_URI[deb2.md5sum] = "17d5a2926d8a2eaf4912275c2cc10fc3"
DEBFILENAME_libkrb5support0 = "libkrb5support0_1.17-3+deb10u1_armhf.deb"
SRC_URI[deb3.sha256sum] = "29a627365797f28fc4312730b732a08d4a0499f014bcb56691891dbf6aadbfa6"
SRC_URI[deb3.md5sum] = "ea0a324152e5421d06eaea9ae362e460"

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

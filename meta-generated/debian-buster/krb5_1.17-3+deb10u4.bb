PACKAGES = "${PN} libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
PROVIDES = "libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/k/krb5/libgssapi-krb5-2_1.17-3+deb10u4_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/k/krb5/libk5crypto3_1.17-3+deb10u4_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/k/krb5/libkrb5-3_1.17-3+deb10u4_armhf.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/k/krb5/libkrb5support0_1.17-3+deb10u4_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libgssapi-krb5-2 = "libgssapi-krb5-2_1.17-3+deb10u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "af07d4bf4d1c88e1f01c698bac82bdef64f211a283954fe82b9d939f7cc3bfd9"
SRC_URI[deb0.md5sum] = "bfb540c4147bcb444725e99356cda400"
DEBFILENAME_libk5crypto3 = "libk5crypto3_1.17-3+deb10u4_armhf.deb"
SRC_URI[deb1.sha256sum] = "5be863d8f5beb9887297db7ec1ad0dc007e2058228cfca8e53fa6dd38fcc7a6e"
SRC_URI[deb1.md5sum] = "8ea934472f6678c5ed40cb7747c5487e"
DEBFILENAME_libkrb5-3 = "libkrb5-3_1.17-3+deb10u4_armhf.deb"
SRC_URI[deb2.sha256sum] = "abc4242c8cf2337b74090c365d79494f68002fe38c30b188f8525287bd9fccae"
SRC_URI[deb2.md5sum] = "5a202daee2e1e3be3a08ddeec12be565"
DEBFILENAME_libkrb5support0 = "libkrb5support0_1.17-3+deb10u4_armhf.deb"
SRC_URI[deb3.sha256sum] = "35ecc5443f46833cbac0c8dc98703a745d7722573f0a26f34e6e25ed6228979c"
SRC_URI[deb3.md5sum] = "07639b9c6fa0f8b3c5830b104dcd89a2"

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

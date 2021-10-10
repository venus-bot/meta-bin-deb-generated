PACKAGES = "${PN} libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
PROVIDES = "libgssapi-krb5-2 libk5crypto3 libkrb5-3 libkrb5support0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/k/krb5/libgssapi-krb5-2_1.17-3+deb10u3_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/k/krb5/libk5crypto3_1.17-3+deb10u3_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/k/krb5/libkrb5-3_1.17-3+deb10u3_armhf.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/k/krb5/libkrb5support0_1.17-3+deb10u3_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libgssapi-krb5-2 = "libgssapi-krb5-2_1.17-3+deb10u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "678f2fb2954777f0451e14e1e1e71125efab5d2b334ee36935e6be32394b1daa"
SRC_URI[deb0.md5sum] = "c4c42c7a2b9a206de5dc4e79918fc49e"
DEBFILENAME_libk5crypto3 = "libk5crypto3_1.17-3+deb10u3_armhf.deb"
SRC_URI[deb1.sha256sum] = "e3b1310e89181a9b8bab4397bfead40ecc98b0089d1eb4ece34dc06b41570434"
SRC_URI[deb1.md5sum] = "47593dc3618691d1e4fd8dc83fd72883"
DEBFILENAME_libkrb5-3 = "libkrb5-3_1.17-3+deb10u3_armhf.deb"
SRC_URI[deb2.sha256sum] = "9107d4e65104d4338ddde8780016cd16997f666d5432adcdde4d2fc3ac9ed24a"
SRC_URI[deb2.md5sum] = "f9273a155d3b00894e45d35203028973"
DEBFILENAME_libkrb5support0 = "libkrb5support0_1.17-3+deb10u3_armhf.deb"
SRC_URI[deb3.sha256sum] = "d38ac9c52f7108d33db2894c786b2cf08a86b15291018091f7aee969ab74bc4a"
SRC_URI[deb3.md5sum] = "f8307440d3a3f9596b8a86f9b9b3ddfe"

RDEPENDS_libgssapi-${PN}-2 = "libc6 (>= 2.27) libcom-err2 (>= 1.43.9) libk5crypto3 (>= 1.16) libkeyutils1 (>= 1.4) libkrb5-3 (= 1.17-3+deb10u3) libkrb5support0 (>= 1.15~beta1)"
RDEPENDS_libk5crypto3 = "libc6 (>= 2.28) libkeyutils1 (>= 1.4) libkrb5support0 (>= 1.16)"
RDEPENDS_lib${PN}-3 = "libc6 (>= 2.28) libcom-err2 (>= 1.43.9) libk5crypto3 (>= 1.15~beta1) libkeyutils1 (>= 1.5.9) libkrb5support0 (= 1.17-3+deb10u3) libssl1.1 (>= 1.1.0)"
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

PACKAGES = "${PN} libfreetype6"
PROVIDES = "libfreetype6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/f/freetype/libfreetype6_2.9.1-3+deb10u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libfreetype6 = "libfreetype6_2.9.1-3+deb10u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "bb19419e5626968199ec286ae29e1f9115188f23c7157332d77dc5471d0a9df7"
SRC_URI[deb0.md5sum] = "92a69e23a48e8e59ec74ebe3ba16cfac"

RDEPENDS_lib${PN}6 = "libc6 (>= 2.28) libpng16-16 (>= 1.6.2-1) zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 libpng16-16 zlib1g"


inherit deb_group

FILES_libfreetype6 = " \
    ./usr/lib/arm-linux-gnueabihf/libfreetype.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libfreetype.so.6.16.1 \
    ./usr/share/doc/libfreetype6/README \
    ./usr/share/doc/libfreetype6/changelog.Debian.gz \
    ./usr/share/doc/libfreetype6/changelog.gz \
    ./usr/share/doc/libfreetype6/copyright\
"

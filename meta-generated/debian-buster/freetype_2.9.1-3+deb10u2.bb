PACKAGES = "${PN} libfreetype6"
PROVIDES = "libfreetype6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/f/freetype/libfreetype6_2.9.1-3+deb10u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libfreetype6 = "libfreetype6_2.9.1-3+deb10u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "20e7bf6985062adfad0bd5a82e176ea3a0496693d933ad737ca9a527540383e6"
SRC_URI[deb0.md5sum] = "a8819089198e771c371f8355f358dd58"

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

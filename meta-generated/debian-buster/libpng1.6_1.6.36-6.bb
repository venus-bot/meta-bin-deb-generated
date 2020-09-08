PACKAGES = "${PN} libpng16-16"
PROVIDES = "libpng16-16"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libp/libpng1.6/libpng16-16_1.6.36-6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpng16-16 = "libpng16-16_1.6.36-6_armhf.deb"
SRC_URI[deb0.sha256sum] = "3f7212c47827a932ee26ca8c64cd60f845be2c6710bc8b81a96d37a7d386d7f3"
SRC_URI[deb0.md5sum] = "80d9cd290158123a0f213bdc40ed70ab"

RDEPENDS_libpng16-16 = "libc6 (>= 2.11) zlib1g (>= 1:1.2.11.dfsg)"
DEPENDS = "libc6 zlib1g"


inherit deb_group

FILES_libpng16-16 = " \
    ./usr/lib/arm-linux-gnueabihf/libpng16.so.16 \
    ./usr/lib/arm-linux-gnueabihf/libpng16.so.16.36.0 \
    ./usr/share/doc-base/libpng16 \
    ./usr/share/doc/libpng16-16/ANNOUNCE \
    ./usr/share/doc/libpng16-16/README.gz \
    ./usr/share/doc/libpng16-16/TODO \
    ./usr/share/doc/libpng16-16/changelog.Debian.gz \
    ./usr/share/doc/libpng16-16/changelog.gz \
    ./usr/share/doc/libpng16-16/copyright \
    ./usr/share/doc/libpng16-16/libpng-manual.txt.gz\
"

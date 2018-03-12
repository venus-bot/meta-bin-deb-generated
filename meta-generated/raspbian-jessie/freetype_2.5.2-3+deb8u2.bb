PACKAGES = "${PN} libfreetype6"
PROVIDES = "libfreetype6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/f/freetype/libfreetype6_2.5.2-3+deb8u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libfreetype6 = "libfreetype6_2.5.2-3+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "121b4dd583278ced16b65048149072486285ac94890bf72ec924dbf6e93e0a66"
SRC_URI[deb0.md5sum] = "c08b8a6d3d6724febb760193bc5ed159"

RDEPENDS_lib${PN}6 = "libc6 (>= 2.11) libpng12-0 (>= 1.2.13-4) zlib1g (>= 1:1.1.4)"
DEPENDS = "zlib1g libc6 libpng12-0"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libfreetype6 = " \
    ./usr/lib/arm-linux-gnueabihf/libfreetype.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libfreetype.so.6.11.1 \
    ./usr/share/doc/libfreetype6/CHANGES.gz \
    ./usr/share/doc/libfreetype6/FTL.TXT.gz \
    ./usr/share/doc/libfreetype6/TODO \
    ./usr/share/doc/libfreetype6/changelog.Debian.gz \
    ./usr/share/doc/libfreetype6/changelog.gz \
    ./usr/share/doc/libfreetype6/copyright \
    ./usr/share/doc/libfreetype6/ft2faq.html \
    ./usr/share/doc/libfreetype6/pcf/README\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

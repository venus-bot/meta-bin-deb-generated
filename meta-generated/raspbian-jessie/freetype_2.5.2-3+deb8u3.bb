PACKAGES = "${PN} libfreetype6"
PROVIDES = "libfreetype6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/f/freetype/libfreetype6_2.5.2-3+deb8u3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libfreetype6 = "libfreetype6_2.5.2-3+deb8u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "5dbeec39687f0caf3a2ad320b6cb4a47a38abb28ec7b93483e1a0b69cf021d3a"
SRC_URI[deb0.md5sum] = "318351b42947265dec0b02945e252a00"

RDEPENDS_lib${PN}6 = "libc6 (>= 2.11) libpng12-0 (>= 1.2.13-4) zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 libpng12-0 zlib1g"


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

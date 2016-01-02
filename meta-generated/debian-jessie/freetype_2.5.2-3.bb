PACKAGES = "libfreetype6"
PROVIDES = "libfreetype6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/f/freetype/libfreetype6_2.5.2-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libfreetype6 = "libfreetype6_2.5.2-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "058ce6980b2311c42427af25a8adf61e6e58e4a1d87ea03e0a351d2e64ee324a"
SRC_URI[deb0.md5sum] = "d40a461bc2ee9c4d11250c3df1acdc77"

RDEPENDS_lib${PN}6 = "libc6 (>= 2.11) libpng12-0 (>= 1.2.13-4) zlib1g (>= 1:1.1.4)"
DEPENDS = "zlib1g libpng12-0 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libfreetype6 = " \
	./usr/lib/arm-linux-gnueabihf/libfreetype.so.6 \
	./usr/share/doc/libfreetype6/CHANGES.gz \
	./usr/share/doc/libfreetype6/TODO \
	./usr/share/doc/libfreetype6/ft2faq.html \
	./usr/share/doc/libfreetype6/FTL.TXT.gz \
	./usr/lib/arm-linux-gnueabihf/libfreetype.so.6.11.1 \
	./usr/share/doc/libfreetype6/changelog.gz \
	./usr/share/doc/libfreetype6/pcf/README \
	./usr/share/doc/libfreetype6/copyright \
	./usr/share/doc/libfreetype6/changelog.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

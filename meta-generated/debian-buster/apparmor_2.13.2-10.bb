PACKAGES = "${PN} libapparmor1"
PROVIDES = "libapparmor1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/a/apparmor/libapparmor1_2.13.2-10_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libapparmor1 = "libapparmor1_2.13.2-10_armhf.deb"
SRC_URI[deb0.sha256sum] = "d9f888e2651932aa8d49c561ad27d29a6a6fd1f2cd6cc58f94cc3517100c81b6"
SRC_URI[deb0.md5sum] = "60855efaa301ef07e64be2e9bedbc96e"

RDEPENDS_lib${PN}1 = "libc6 (>= 2.17)"
DEPENDS = "libc6"


inherit deb_group

FILES_libapparmor1 = " \
    ./lib/arm-linux-gnueabihf/libapparmor.so.1 \
    ./lib/arm-linux-gnueabihf/libapparmor.so.1.6.0 \
    ./usr/share/doc/libapparmor1/changelog.Debian.gz \
    ./usr/share/doc/libapparmor1/copyright \
    ./usr/share/lintian/overrides/libapparmor1\
"

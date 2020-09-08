PACKAGES = "${PN} libelf1"
PROVIDES = "libelf1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/e/elfutils/libelf1_0.176-1.1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libelf1 = "libelf1_0.176-1.1_armhf.deb"
SRC_URI[deb0.sha256sum] = "0032ea415b15f936849cecbd90b7d200bbdbbfd1c737c97c6fa3928a36172213"
SRC_URI[deb0.md5sum] = "56248672772b93094fda370bc79d23ab"

RDEPENDS_libelf1 = "libc6 (>= 2.28) zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 zlib1g"


inherit deb_group

FILES_libelf1 = " \
    ./usr/lib/arm-linux-gnueabihf/libelf-0.176.so \
    ./usr/lib/arm-linux-gnueabihf/libelf.so.1 \
    ./usr/share/doc/libelf1/changelog.Debian.gz \
    ./usr/share/doc/libelf1/changelog.gz \
    ./usr/share/doc/libelf1/copyright \
    ./usr/share/locale/de/LC_MESSAGES/elfutils.mo \
    ./usr/share/locale/en@boldquot/LC_MESSAGES/elfutils.mo \
    ./usr/share/locale/en@quot/LC_MESSAGES/elfutils.mo \
    ./usr/share/locale/es/LC_MESSAGES/elfutils.mo \
    ./usr/share/locale/ja/LC_MESSAGES/elfutils.mo \
    ./usr/share/locale/pl/LC_MESSAGES/elfutils.mo \
    ./usr/share/locale/uk/LC_MESSAGES/elfutils.mo\
"

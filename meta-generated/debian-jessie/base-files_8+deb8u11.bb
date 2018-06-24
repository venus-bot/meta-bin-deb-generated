PACKAGES = "${PN} base-files"
PROVIDES = "base-files"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/b/base-files/base-files_8+deb8u11_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_base-files = "base-files_8+deb8u11_armhf.deb"
SRC_URI[deb0.sha256sum] = "ff63400a82b25f7e15dabbf36fa7ec66c0cc37a9405cf74c576a1a78668fd653"
SRC_URI[deb0.md5sum] = "e27d36a89417c6e05f6883637a22322c"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./etc/debian_version \
    ./etc/dpkg/origins/debian \
    ./etc/host.conf \
    ./etc/issue \
    ./etc/issue.net \
    ./etc/os-release \
    ./usr/lib/os-release \
    ./usr/share/base-files/dot.bashrc \
    ./usr/share/base-files/dot.profile \
    ./usr/share/base-files/info.dir \
    ./usr/share/base-files/motd \
    ./usr/share/base-files/nsswitch.conf \
    ./usr/share/base-files/nsswitch.conf.md5sums \
    ./usr/share/base-files/profile \
    ./usr/share/base-files/profile.md5sums \
    ./usr/share/base-files/staff-group-for-usr-local \
    ./usr/share/common-licenses/Apache-2.0 \
    ./usr/share/common-licenses/Artistic \
    ./usr/share/common-licenses/BSD \
    ./usr/share/common-licenses/GFDL \
    ./usr/share/common-licenses/GFDL-1.2 \
    ./usr/share/common-licenses/GFDL-1.3 \
    ./usr/share/common-licenses/GPL \
    ./usr/share/common-licenses/GPL-1 \
    ./usr/share/common-licenses/GPL-2 \
    ./usr/share/common-licenses/GPL-3 \
    ./usr/share/common-licenses/LGPL \
    ./usr/share/common-licenses/LGPL-2 \
    ./usr/share/common-licenses/LGPL-2.1 \
    ./usr/share/common-licenses/LGPL-3 \
    ./usr/share/doc/base-files/FAQ \
    ./usr/share/doc/base-files/README \
    ./usr/share/doc/base-files/README.FHS \
    ./usr/share/doc/base-files/changelog.gz \
    ./usr/share/doc/base-files/copyright \
    ./usr/share/lintian/overrides/base-files\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PACKAGES = "${PN} bash"
PROVIDES = "bash"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/b/bash/bash_4.3-11+deb8u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_bash = "bash_4.3-11+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "1d6ee333206fa60a83b7016653dbb7b41f677a318f5192be2dd08acaba6ee265"
SRC_URI[deb0.md5sum] = "eb183b214c813376305297f86a08961d"

RDEPENDS_${PN} = "base-files (>= 2.1.12) debianutils (>= 2.15)"
DEPENDS = "base-files debianutils"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./bin/bash \
    ./bin/rbash \
    ./etc/bash.bashrc \
    ./etc/skel/.bash_logout \
    ./etc/skel/.bashrc \
    ./etc/skel/.profile \
    ./usr/bin/bashbug \
    ./usr/bin/clear_console \
    ./usr/share/doc/bash/CHANGES.gz \
    ./usr/share/doc/bash/COMPAT.gz \
    ./usr/share/doc/bash/INTRO.gz \
    ./usr/share/doc/bash/NEWS.gz \
    ./usr/share/doc/bash/POSIX.gz \
    ./usr/share/doc/bash/RBASH \
    ./usr/share/doc/bash/README \
    ./usr/share/doc/bash/README.Debian.gz \
    ./usr/share/doc/bash/README.abs-guide \
    ./usr/share/doc/bash/README.commands.gz \
    ./usr/share/doc/bash/changelog.Debian.gz \
    ./usr/share/doc/bash/copyright \
    ./usr/share/doc/bash/inputrc.arrows \
    ./usr/share/lintian/overrides/bash \
    ./usr/share/locale/af/LC_MESSAGES/bash.mo \
    ./usr/share/locale/bg/LC_MESSAGES/bash.mo \
    ./usr/share/locale/ca/LC_MESSAGES/bash.mo \
    ./usr/share/locale/cs/LC_MESSAGES/bash.mo \
    ./usr/share/locale/da/LC_MESSAGES/bash.mo \
    ./usr/share/locale/de/LC_MESSAGES/bash.mo \
    ./usr/share/locale/el/LC_MESSAGES/bash.mo \
    ./usr/share/locale/en@boldquot/LC_MESSAGES/bash.mo \
    ./usr/share/locale/en@quot/LC_MESSAGES/bash.mo \
    ./usr/share/locale/eo/LC_MESSAGES/bash.mo \
    ./usr/share/locale/es/LC_MESSAGES/bash.mo \
    ./usr/share/locale/et/LC_MESSAGES/bash.mo \
    ./usr/share/locale/fi/LC_MESSAGES/bash.mo \
    ./usr/share/locale/fr/LC_MESSAGES/bash.mo \
    ./usr/share/locale/ga/LC_MESSAGES/bash.mo \
    ./usr/share/locale/gl/LC_MESSAGES/bash.mo \
    ./usr/share/locale/hr/LC_MESSAGES/bash.mo \
    ./usr/share/locale/hu/LC_MESSAGES/bash.mo \
    ./usr/share/locale/id/LC_MESSAGES/bash.mo \
    ./usr/share/locale/it/LC_MESSAGES/bash.mo \
    ./usr/share/locale/ja/LC_MESSAGES/bash.mo \
    ./usr/share/locale/lt/LC_MESSAGES/bash.mo \
    ./usr/share/locale/nl/LC_MESSAGES/bash.mo \
    ./usr/share/locale/pl/LC_MESSAGES/bash.mo \
    ./usr/share/locale/pt_BR/LC_MESSAGES/bash.mo \
    ./usr/share/locale/ro/LC_MESSAGES/bash.mo \
    ./usr/share/locale/ru/LC_MESSAGES/bash.mo \
    ./usr/share/locale/sk/LC_MESSAGES/bash.mo \
    ./usr/share/locale/sl/LC_MESSAGES/bash.mo \
    ./usr/share/locale/sr/LC_MESSAGES/bash.mo \
    ./usr/share/locale/sv/LC_MESSAGES/bash.mo \
    ./usr/share/locale/tr/LC_MESSAGES/bash.mo \
    ./usr/share/locale/uk/LC_MESSAGES/bash.mo \
    ./usr/share/locale/vi/LC_MESSAGES/bash.mo \
    ./usr/share/locale/zh_CN/LC_MESSAGES/bash.mo \
    ./usr/share/locale/zh_TW/LC_MESSAGES/bash.mo \
    ./usr/share/man/man1/bash.1.gz \
    ./usr/share/man/man1/bashbug.1.gz \
    ./usr/share/man/man1/clear_console.1.gz \
    ./usr/share/man/man1/rbash.1.gz \
    ./usr/share/man/man7/bash-builtins.7.gz \
    ./usr/share/menu/bash\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
